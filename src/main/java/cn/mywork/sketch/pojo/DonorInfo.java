package cn.mywork.sketch.pojo;

import java.util.Date;
import lombok.Data;

/**
 * donor_info
 * @author sketch
 * @date 2022/01/07
 */
@Data
public class DonorInfo {
    /**
     * Column:id; Nullable:false
     */
    private Integer id;

    /**
     * æ��èµ äººCode
     * Column:donor_code; Nullable:true
     */
    private String donorCode;

    /**
     * æ��èµ äººå§“å��
     * Column:donor_name; Nullable:true
     */
    private String donorName;

    /**
     * æ��èµ äººç”µè¯�
     * Column:donor_phone; Nullable:true
     */
    private String donorPhone;

    /**
     * æ��èµ äººèº«ä»½è¯�å�·
     * Column:donor_id; Nullable:true
     */
    private String donorId;

    /**
     * æ��èµ ç§¯åˆ†
     * Column:donor_point; Nullable:true
     */
    private Integer donorPoint;

    /**
     * Column:create_time; Nullable:true
     */
    private Date createTime;

    /**
     * Column:update_time; Nullable:true
     */
    private Date updateTime;
}
