package cn.mywork.sketch.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: sketch
 * @Date: 2022/1/6 20:47
 */
@Data
public class PersonalSelectVo implements Serializable {
    private static final long serialVersionUID = 4249534101633399370L;
    private Integer id;
    private String name;
    private Integer departmentId;
    private Integer positionId;
}
