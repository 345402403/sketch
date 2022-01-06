package cn.mywork.sketch.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: sketch
 * @Date: 2022/1/6 20:47
 */
@Data
public class UserVo implements Serializable {

    private static final long serialVersionUID = -2493742024666741317L;
    private Integer id;
    private String username;
    private Integer roleId;
    private String roleDescription;
}
