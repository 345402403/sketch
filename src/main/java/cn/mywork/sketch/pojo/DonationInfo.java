package cn.mywork.sketch.pojo;

import java.util.Date;
import lombok.Data;

/**
 * donation_info
 * @author sketch
 * @date 2022/01/07
 */
@Data
public class DonationInfo {
    /**
     * Column:id; Nullable:false
     */
    private Integer id;

    /**
     * æ��èµ è®°å½•Code
     * Column:donation_code; Nullable:true
     */
    private String donationCode;

    /**
     * æ��èµ çŠ¶æ€�ï¼Œ0ï¼šå¾…åˆ†é…�,1:å·²ä¸‹å�‘
     * Column:demand_status; Nullable:true
     */
    private Integer demandStatus;

    /**
     * æ��èµ äºº
     * Column:donor_name; Nullable:true
     */
    private String donorName;

    /**
     * æ��èµ äººç”µè¯�
     * Column:donor_phone; Nullable:true
     */
    private String donorPhone;

    /**
     * æ��èµ éœ€æ±‚Code
     * Column:demand_code; Nullable:true
     */
    private String demandCode;

    /**
     * æ��èµ ç‰©å“�ç±»åž‹
     * Column:donation_goods_code; Nullable:true
     */
    private Integer donationGoodsCode;

    /**
     * æ��èµ ç‰©å“�æ•°é‡�
     * Column:goods_amount; Nullable:true
     */
    private String goodsAmount;

    /**
     * æ��èµ æ—¥æœŸ
     * Column:donate_date; Nullable:true
     */
    private Date donateDate;

    /**
     * æ��èµ åœ°ç‚¹
     * Column:donate_location; Nullable:true
     */
    private String donateLocation;

    /**
     * Column:create_time; Nullable:true
     */
    private Date createTime;

    /**
     * Column:update_time; Nullable:true
     */
    private Date updateTime;
}
