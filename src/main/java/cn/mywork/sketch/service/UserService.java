package cn.mywork.sketch.service;

import cn.mywork.sketch.pojo.UserInfo;
import cn.mywork.sketch.vo.UserVo;
import cn.mywork.sketch.pojo.RoleInfo;
import com.github.pagehelper.PageInfo;

import java.util.Collection;
import java.util.List;

/**
 * @author: sketch
 * @Date: 2022/1/6 20:47
 */
public interface UserService {

    UserInfo findByUsername(String username);

    UserInfo find(int id);

    PageInfo<UserVo> findList(int pageNum, int pageSize);

    void deleteById(int id);

    void deleteByIdIn(Collection<Integer> idList);

    void insert(UserInfo userInfo);

    void updateById(UserInfo userInfo);

    List<RoleInfo> roleList();
}
