package com.processor.excel.extity.doctor;

import lombok.Data;

import java.util.List;

/**
 * @author fcoolish
 * @date 2022-04-03
 */
@Data
public  class DoctorBean {
    /**
     * id : 18946
     * simuid : 0
     * compliance : true
     * sex : 1
     * nickname : 胡亮
     * avatar : https://img1.dxycdn.com/2020/0212/771/3396257297155402580-22.jpg!wh200
     * big_avatar : https://img1.dxycdn.com/2020/0212/771/3396257297155402580-22.jpg
     * user_id : 11896469
     * reward_base : 4900
     * setting_price : 4900
     * tencent_price : 4900
     * baidu_price : 4900
     * reward_discount_str :
     * volunteer_reward_base : 0
     * volunteer_reward_discount_str :
     * self_desc : 从事儿内科工作十余年，经验丰富，特别对呼吸道疾病有着独到的见解，赢得病人的认可，和医院的肯定，多次评为医院优秀医师。
     * job_title_id : 3
     * job_title_name : 主治医师
     * vip : false
     * hospital_id : 17298
     * hospital_name : 新余市妇幼保健院
     * section_id : 1401
     * section_name : 小儿内科
     * team_id : 0
     * reply_user_count : 7823
     * star_user_count : 142
     * reply_count : 551
     * prescription_count : 1
     * star_sum : 708
     * follower_count : 0
     * card_url :
     * scene_url : http://weixin.qq.com/q/02H8-UtN_od-k10000M03N
     * permanent_scene_url : http://weixin.qq.com/q/02H8-UtN_od-k10000M03N
     * status : 0
     * banned : false
     * force_paused : false
     * profile_url : https://ask.dxy.com/d/18946
     * tags : ["小儿腹泻","过敏","功能性消化不良","湿疹","小儿感冒","小儿发热"]
     * trend_label_reason :
     * tag_references : [{"id":0,"content":"小儿腹泻"},{"id":0,"content":"过敏"},{"id":0,"content":"功能性消化不良"},{"id":0,"content":"湿疹"},{"id":0,"content":"小儿感冒"},{"id":0,"content":"小儿发热"}]
     * tag_nodes : [{"id":7189,"type":1,"name":"小儿腹泻","show_type":0},{"id":995,"type":1,"name":"过敏","show_type":0},{"id":6582,"type":1,"name":"功能性消化不良","show_type":0},{"id":25472,"type":1,"name":"湿疹","show_type":0},{"id":7194,"type":1,"name":"小儿感冒","show_type":0},{"id":7174,"type":2,"name":"小儿发热","show_type":0}]
     * location : 360500
     * location_name : 新余市
     * same_city : false
     * d2d_expert : false
     * consult_price_cent : 0
     * floor_price : 1900
     * top_price : 12900
     * recom_price : [6900]
     * start_work_year : 2006
     * hospital_info : {"id":17298,"name":"新余市妇幼保健院","address":"新余市劳动南路292号","phone":"0790-6222016","phone_array":["0790-6222016"],"loc_gcj02_lng":"0.0","loc_gcj02_lat":"0.0","tags":[{"name":"三甲医院"},{"name":"医保"}],"tertiary_hospital":true}
     * marking_tags : [{"name":"从业10年以上","type":11,"description":"医生自己选择的标签","description_name":"医生个人"},{"name":"快速响应","type":13,"description":"近30天的已回答问题的平均响应时长< 10分钟","description_name":"快速响应"},{"name":"可开处方","type":9,"description":"可以开具电子处方的医生","description_name":"可开处方"}]
     * properties : []
     * mdt : false
     * expert : false
     * check_expert : false
     * faq_casual_count : 0
     * list_dis_tags : [{"name":"从业10年以上","type":11,"description":"医生自己选择的标签","description_name":"医生个人"},{"name":"快速响应","type":13,"description":"近30天的已回答问题的平均响应时长< 10分钟","description_name":"快速响应"}]
     * list_trait_tags : [{"name":"从业10年以上","type":11,"description":"医生自己选择的标签","description_name":"医生个人"},{"name":"快速响应","type":13,"description":"近30天的已回答问题的平均响应时长< 10分钟","description_name":"快速响应"},{"name":"可开处方","type":9,"description":"可以开具电子处方的医生","description_name":"可开处方"}]
     * waiting_reply : 0
     * weight : 55
     * pass_test : true
     * can_give_emergency_treatment : false
     * invite_faq_status : 0
     * send_word :
     * avg_reply_time_str : 5分钟内
     * avg_reply_time_v2_str : 5分钟响应
     * prescription_qualified : true
     * drugs_qualified : false
     * doctor_qualification : {"can_doctor_vip_card":true,"can_membership_service":false,"can_deal_medicine_suggest":false}
     * enable_prescription_improve : true
     * volunteer_stock : 0
     * reduce_cost : 0
     * limit_amount : 0
     * record_in_yinchuan : true
     * commonly_doctor : false
     * intro_video_url :
     * intro_thumbnail_url :
     * new_user_price : 100
     * newcomer_price : 0
     * newcomer_price_str :
     * vipcard :
     * identity_card_num :
     * make_call_status : 0
     * make_call_status_str :
     * make_call_str :
     * make_call_permission : 0
     * make_call_price : 7900
     * make_call_price_str : ¥79/15分钟
     * make_call_time_str :
     * make_call_closest_day_status : 0
     * make_call_closest_day_str :
     * doctor_call_permission : 0
     * doctor_call_price : 7900
     * doctor_call_price_str : ¥79/15分钟
     * doctor_call_time_str :
     * doctor_call_out_status : 0
     * doctor_call_out_status_str :
     * img_text_str : 上传图片、视频及文字向医生咨询，包含3次问诊机会
     * doctor_reply_check_grade : 0
     * recommend_comment : 感谢胡医生，我可以买点西甲硅油让孩子试试吗？喝西甲有副作用吗？求回答，感谢
     * membership_for_doctor : {"membership_available":false}
     * drug_supplier_id : 5
     * list_operate_tags : [{"name":"从业10年以上","type":11,"description":"医生自己选择的标签","description_name":"医生个人"},{"name":"快速响应","type":13,"description":"近30天的已回答问题的平均响应时长< 10分钟","description_name":"快速响应"}]
     * volunteer : false
     * new_doctor : false
     * average_star : 4.99
     * is_new_doctor : false
     * is_volunteer : false
     */

    private int id;
    private String simuid;
    private boolean compliance;
    private int sex;
    private String nickname;
    private String avatar;
    private String big_avatar;
    private int user_id;
    private int reward_base;
    private int setting_price;
    private int tencent_price;
    private int baidu_price;
    private String reward_discount_str;
    private int volunteer_reward_base;
    private String volunteer_reward_discount_str;
    private String self_desc;
    private int job_title_id;
    private String job_title_name;
    private boolean vip;
    private int hospital_id;
    private String hospital_name;
    private int section_id;
    private String section_name;
    private int team_id;
    private int reply_user_count;
    private int star_user_count;
    private int reply_count;
    private int prescription_count;
    private int star_sum;
    private int follower_count;
    private String card_url;
    private String scene_url;
    private String permanent_scene_url;
    private int status;
    private boolean banned;
    private boolean force_paused;
    private String profile_url;
    private String trend_label_reason;
    private int location;
    private String location_name;
    private boolean same_city;
    private boolean d2d_expert;
    private int consult_price_cent;
    private int floor_price;
    private int top_price;
    private int start_work_year;
    private HospitalInfoBean hospital_info;
    private boolean mdt;
    private boolean expert;
    private boolean check_expert;
    private int faq_casual_count;
    private int waiting_reply;
    private int weight;
    private boolean pass_test;
    private boolean can_give_emergency_treatment;
    private int invite_faq_status;
    private String send_word;
    private String avg_reply_time_str;
    private String avg_reply_time_v2_str;
    private boolean prescription_qualified;
    private boolean drugs_qualified;
    private DoctorQualificationBean doctor_qualification;
    private boolean enable_prescription_improve;
    private int volunteer_stock;
    private int reduce_cost;
    private int limit_amount;
    private boolean record_in_yinchuan;
    private boolean commonly_doctor;
    private String intro_video_url;
    private String intro_thumbnail_url;
    private int new_user_price;
    private int newcomer_price;
    private String newcomer_price_str;
    private String vipcard;
    private String identity_card_num;
    private int make_call_status;
    private String make_call_status_str;
    private String make_call_str;
    private int make_call_permission;
    private int make_call_price;
    private String make_call_price_str;
    private String make_call_time_str;
    private int make_call_closest_day_status;
    private String make_call_closest_day_str;
    private int doctor_call_permission;
    private int doctor_call_price;
    private String doctor_call_price_str;
    private String doctor_call_time_str;
    private int doctor_call_out_status;
    private String doctor_call_out_status_str;
    private String img_text_str;
    private int doctor_reply_check_grade;
    private String recommend_comment;
    private MembershipForDoctorBean membership_for_doctor;
    private int drug_supplier_id;
    private boolean volunteer;
    private boolean new_doctor;
    private String average_star;
    private boolean is_new_doctor;
    private boolean is_volunteer;
    private List<String> tags;
    private List<TagReferencesBean> tag_references;
    private List<TagNodesBean> tag_nodes;
    private List<Integer> recom_price;
    private List<MarkingTagsBean> marking_tags;
    private List<?> properties;
    private List<ListDisTagsBean> list_dis_tags;
    private List<ListTraitTagsBean> list_trait_tags;
    private List<ListOperateTagsBean> list_operate_tags;
}
