package cn.mywork.sketch.dao;

import cn.mywork.sketch.pojo.PersonalInfo;
import cn.mywork.sketch.vo.PersonalVo;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

public interface PersonalDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    int insert(PersonalInfo record);

    /**
     * @mbg.generated
     */
    int insertSelective(PersonalInfo record);

    /**
     * @mbg.generated
     */
    PersonalVo selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PersonalInfo record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(PersonalInfo record);

    List<PersonalVo> selectAll(@Param("departmentId") Integer departmentId, @Param("personalName") String personalName, @Param("workStatus") int workStatus);

    int deleteByIdIn(@Param("idList") Collection<Integer> idList);
}
