package com.processor.excel.extity.doctor;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author fcoolish
 * @date 2022-04-03
 */
@Data
public class SimpleDoctorBean {

    @ExcelProperty("名字")
    private String name;

    @ExcelProperty("科室")
    private String section;//科室

    @ExcelProperty("医院")
    private String hospital;

    @ExcelProperty("擅长领域")
    private String des;
}
