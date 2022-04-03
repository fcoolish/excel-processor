package com.processor.excel.processor; /**
 * Created by d on 2022/4/03.
 */

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.fastjson.JSON;
import com.processor.excel.extity.doctor.DoctorInfo;
import com.processor.excel.extity.doctor.SimpleDoctorBean;
import com.processor.excel.extity.doctor.enums.SheetEnum;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class TextToExcel {


    /**
     * 通过文本获取数据
     *
     * @param filePath
     * @return
     * @throws Exception
     */
    private static String readText(String filePath) throws Exception {
        StringBuilder sb = new StringBuilder();
        FileInputStream fin = new FileInputStream(filePath);
        InputStreamReader reader = new InputStreamReader(fin);
        BufferedReader buffReader = new BufferedReader(reader);
        String strTmp = "";
        while ((strTmp = buffReader.readLine()) != null) {
            sb.append(strTmp);
        }
        buffReader.close();
        return sb.toString();

    }

    //处理数据
    private static List<SimpleDoctorBean> processData(String data) throws Exception {
        List<DoctorInfo> doctorInfos = new LinkedList<>();
        List<SimpleDoctorBean> doctors = new LinkedList<>();
        doctorInfos = JSON.parseArray(data, DoctorInfo.class);
        for (DoctorInfo info : doctorInfos) {
            System.out.println(JSON.toJSON(info));
            SimpleDoctorBean bean = new SimpleDoctorBean();
            bean.setName(info.getNickname());
            bean.setSection(info.getDoctor().getSection_name());
            bean.setHospital(info.getDoctor().getHospital_name());
            List<String> tags = info.getDoctor().getTags();
            String tagDesc = String.join("、", tags);
            String desc = info.getDoctor().getSelf_desc() + tagDesc;
            bean.setDes(desc);
            doctors.add(bean);
        }
        return doctors;
    }

    //输出数据
    private static List<SimpleDoctorBean> writeData(List<List<SimpleDoctorBean>> beans, String fileName) throws Exception {
        // 如果写到不同的sheet
        ExcelWriter excelWriter = null;
        try {
            // 这里 指定文件
            excelWriter = EasyExcel.write(fileName, SimpleDoctorBean.class).build();
            for (int i = 0; i < beans.size(); i++) {
                // 每次都要创建writeSheet 这里注意必须指定sheetNo 而且sheetName必须不一样
                WriteSheet writeSheet = EasyExcel.writerSheet(i, SheetEnum.getSheetName(i)).build();
                excelWriter.write(beans.get(i), writeSheet);
            }
        } finally {
            // finish 会帮忙关闭流
            if (excelWriter != null) {
                excelWriter.finish();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // 读取数据文本文件
        List<List<SimpleDoctorBean>> beans = new LinkedList<>();
        String writePath = "/Users/fcoolish/Desktop/doctor.xlsx";
        try {
            //得到所有数据
            for(int i =1;i < 6;i++){
                String readPath = "/Users/fcoolish/Desktop/";
                readPath = readPath +i+ ".txt";
                String data = readText(readPath);
                List<SimpleDoctorBean> list = processData(data);
                beans.add(list);
            }
            writeData(beans, writePath);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}