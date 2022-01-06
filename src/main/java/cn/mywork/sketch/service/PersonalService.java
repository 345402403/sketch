package cn.mywork.sketch.service;

import cn.mywork.sketch.vo.PersonalSelectVo;
import cn.mywork.sketch.vo.PersonalVo;
import cn.mywork.sketch.vo.input.PersonalForm;
import com.github.pagehelper.PageInfo;

import java.util.Collection;
import java.util.List;

/**
 * @author: sketch
 * @Date: 2022/1/6 20:47
 */
public interface PersonalService {

    PageInfo<PersonalVo> findAll(int pageNum, int pageSize, int departmentId, String personalName, int workStatus);
    List<PersonalVo> All();

    List<PersonalSelectVo> findSelect();

    PersonalVo find(int id);

    void insert(PersonalForm personalForm);

    void deleteById(Integer id);

    void deleteByIdIn(Collection<Integer> idList);

    void updateById(Integer id, PersonalForm personalForm);
}
