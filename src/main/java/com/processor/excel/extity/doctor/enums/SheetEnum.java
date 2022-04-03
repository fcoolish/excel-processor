package com.processor.excel.extity.doctor.enums;

import lombok.Data;

/**
 * @author fcoolish
 * @date 2022-04-03
 */
public enum SheetEnum {
    PAEDIATRICS(0,"小儿内科"),
    GYNAECOLOGY(1,"妇科"),
    OBSTETRICS(2,"产科"),
    UROLOGY(3,"泌尿外科"),
    ENDOCRINOLOGY(4,"内分泌科");

    private int sheetNo;
    private String section;



    public static String getSheetName(int sheetNo) {
        for (SheetEnum c : SheetEnum.values()) {
            if (c.getSheetNo() == sheetNo) {
                return c.section;
            }
        }
        return "sheet1";
    }


    private SheetEnum(int sheetNo,String section) {
        this.sheetNo = sheetNo;
        this.section = section;
    }

    public int getSheetNo() {
        return sheetNo;
    }

    public void setSheetNo(int sheetNo) {
        this.sheetNo = sheetNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
