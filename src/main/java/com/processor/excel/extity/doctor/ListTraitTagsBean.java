package com.processor.excel.extity.doctor;

import lombok.Data;

/**
 * @author fcoolish
 * @date 2022-04-03
 */
@Data
public class ListTraitTagsBean {
    /**
     * name : 从业10年以上
     * type : 11
     * description : 医生自己选择的标签
     * description_name : 医生个人
     */

    private String name;
    private int type;
    private String description;
    private String description_name;
}
