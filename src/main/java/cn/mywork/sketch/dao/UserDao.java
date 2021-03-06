package cn.mywork.sketch.dao;
import java.util.Collection;
import java.util.List;

import cn.mywork.sketch.pojo.User;
import cn.mywork.sketch.vo.UserVo;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    /**
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    int updateByPrimaryKey(User record);

    User selectByUsername(@Param("username") String username);

    List<UserVo> selectAll();

    int deleteByIdIn(@Param("idList") Collection<Integer> idList);
}
