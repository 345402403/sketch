package cn.mywork.sketch.service.impl;

import cn.mywork.sketch.exception.BaseException;
import cn.mywork.sketch.service.UserService;
import cn.mywork.sketch.vo.UserVo;
import cn.mywork.sketch.dao.RoleDao;
import cn.mywork.sketch.dao.UserDao;
import cn.mywork.sketch.enums.ResultEnum;
import cn.mywork.sketch.pojo.Role;
import cn.mywork.sketch.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @author: sketch
 * @Date: 2021/2/18 21:07
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;
    @Resource
    RoleDao roleDao;

    @Override
    public User findByUsername(String username) {
        User user = userDao.selectByUsername(username);
        if (ObjectUtils.isEmpty(user)) {
            throw new BaseException(ResultEnum.USER_NOT_EXIST);
        }
        return user;
    }

    @Override
    public User find(int id) {
        User user = userDao.selectByPrimaryKey(id);
        if (ObjectUtils.isEmpty(user)) {
            throw new BaseException(ResultEnum.USER_NOT_EXIST);
        }
        return user;
    }

    @Override
    public PageInfo<UserVo> findList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(userDao.selectAll());
    }

    @Override
    public void deleteById(int id) {
        userDao.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdIn(Collection<Integer> idList) {
        userDao.deleteByIdIn(idList);
    }

    @Override
    public void insert(User user) {
        userDao.insertSelective(user);
    }

    @Override
    public void updateById(User user) {
        userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<Role> roleList() {
        return roleDao.selectAll();
    }
}
