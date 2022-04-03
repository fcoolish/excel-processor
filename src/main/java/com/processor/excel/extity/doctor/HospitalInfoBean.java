package com.processor.excel.extity.doctor;

import lombok.Data;

import java.util.List;

/**
 * @author fcoolish
 * @date 2022-04-03
 */
@Data
public  class HospitalInfoBean {
    /**
     * id : 17298
     * name : 新余市妇幼保健院
     * address : 新余市劳动南路292号
     * phone : 0790-6222016
     * phone_array : ["0790-6222016"]
     * loc_gcj02_lng : 0.0
     * loc_gcj02_lat : 0.0
     * tags : [{"name":"三甲医院"},{"name":"医保"}]
     * tertiary_hospital : true
     */

    private int id;
    private String name;
    private String address;
    private String phone;
    private String loc_gcj02_lng;
    private String loc_gcj02_lat;
    private boolean tertiary_hospital;
    private List<String> phone_array;
    private List<TagsBean> tags;
}
