package cn.mywork.sketch.dao;
import java.util.List;

import cn.mywork.sketch.pojo.Role;

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
    int insert(Role record);

    /**
     *
     * @mbg.generated 2021-02-20 19:39:57
     */
    int insertSelective(Role record);

    /**
     *
     * @mbg.generated 2021-02-20 19:39:57
     */
    Role selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-02-20 19:39:57
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *
     * @mbg.generated 2021-02-20 19:39:57
     */
    int updateByPrimaryKey(Role record);

    List<Role> selectAll();
}
