package cn.mywork.sketch.service;

import cn.mywork.sketch.vo.UserVo;
import cn.mywork.sketch.pojo.Role;
import cn.mywork.sketch.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.Collection;
import java.util.List;

/**
 * @author: sketch
 * @Date: 2022/1/6 20:47
 */
public interface UserService {

    User findByUsername(String username);

    User find(int id);

    PageInfo<UserVo> findList(int pageNum, int pageSize);

    void deleteById(int id);

    void deleteByIdIn(Collection<Integer> idList);

    void insert(User user);

    void updateById(User user);

    List<Role> roleList();
}
