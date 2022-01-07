package cn.mywork.sketch.pojo;

import java.util.Date;
import lombok.Data;

/**
 * demand_info
 * @author sketch
 * @date 2022/01/07
 */
@Data
public class DemandInfo {
    /**
     * Column:id; Nullable:false
     */
    private Integer id;

    /**
     * éœ€æ±‚Code
     * Column:demand_code; Nullable:true
     */
    private String demandCode;

    /**
     * éœ€æ±‚å��ç§°
     * Column:demand_name; Nullable:true
     */
    private String demandName;

    /**
     * éœ€æ±‚çŠ¶æ€�ï¼Œ0ï¼šæœªå�‘å¸ƒ,1:å·²å�‘å¸ƒ,2:å·²ç»“æ�Ÿ
     * Column:demand_status; Nullable:true
     */
    private Integer demandStatus;

    /**
     * éœ€æ±‚å�•ä½�å��ç§°
     * Column:host_name; Nullable:true
     */
    private String hostName;

    /**
     * éœ€æ±‚å�•ä½�è�”ç³»äºº
     * Column:host_contacts; Nullable:true
     */
    private String hostContacts;

    /**
     * éœ€æ±‚å�•ä½�ç”µè¯�
     * Column:host_phone; Nullable:true
     */
    private String hostPhone;

    /**
     * å¼€å§‹æ—¥æœŸ
     * Column:begin_date; Nullable:true
     */
    private Date beginDate;

    /**
     * ç»“æ�Ÿæ—¥æœŸ
     * Column:end_date; Nullable:true
     */
    private Date endDate;

    /**
     * éœ€æ±‚æ��è¿°
     * Column:desc; Nullable:true
     */
    private String desc;

    /**
     * Column:create_time; Nullable:true
     */
    private Date createTime;

    /**
     * Column:update_time; Nullable:true
     */
    private Date updateTime;
}
