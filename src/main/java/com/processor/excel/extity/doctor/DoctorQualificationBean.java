package com.processor.excel.extity.doctor;

import lombok.Data;

/**
 * @author fcoolish
 * @date 2022-04-03
 */
@Data
public class DoctorQualificationBean {
    /**
     * can_doctor_vip_card : true
     * can_membership_service : false
     * can_deal_medicine_suggest : false
     */

    private boolean can_doctor_vip_card;
    private boolean can_membership_service;
    private boolean can_deal_medicine_suggest;
}
