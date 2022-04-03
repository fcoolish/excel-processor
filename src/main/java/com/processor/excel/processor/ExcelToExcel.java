package com.processor.excel.processor; /**
 * Created by fcoolish on 2022/4/03.
 */

import com.processor.excel.extity.doctor.DoctorInfo;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class ExcelToExcel {


    /**
     * 通过excel获取数据
     * @param file
     * @return
     * @throws Exception
     */
    private static List<DoctorInfo> readExcel(File file) throws Exception {
        List<DoctorInfo> doctorInfos = new LinkedList<>();
        return doctorInfos;

    }



    public static void main(String[] args) {

        // 读取excel数据文件
        File file = new File("/Users/fcoolish/Desktop/doctor.txt");
        try {
            //得到所有数据
            List<DoctorInfo> allData = readExcel(file);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



}