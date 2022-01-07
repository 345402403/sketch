package cn.mywork.sketch.dao;
import java.util.List;

import cn.mywork.sketch.pojo.RoleInfo;

public interface RoleDao {
    /**
     *
     * @mbg.generated 2021-02-20 19:39:57
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-02-20 19:39:57
     */
    int insert(RoleInfo record);

    /**
     *
     * @mbg.generated 2021-02-20 19:39:57
     */
    int insertSelective(RoleInfo record);

    /**
     *
     * @mbg.generated 2021-02-20 19:39:57
     */
    RoleInfo selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-02-20 19:39:57
     */
    int updateByPrimaryKeySelective(RoleInfo record);

    /**
     *
     * @mbg.generated 2021-02-20 19:39:57
     */
    int updateByPrimaryKey(RoleInfo record);

    List<RoleInfo> selectAll();
}
