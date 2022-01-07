package cn.mywork.sketch.service.impl;

import cn.mywork.sketch.exception.BaseException;
import cn.mywork.sketch.pojo.UserInfo;
import cn.mywork.sketch.service.UserService;
import cn.mywork.sketch.vo.UserVo;
import cn.mywork.sketch.dao.RoleDao;
import cn.mywork.sketch.dao.UserDao;
import cn.mywork.sketch.enums.ResultEnum;
import cn.mywork.sketch.pojo.RoleInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @author: sketch
 * @Date: 2022/1/6 20:47
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;
    @Resource
    RoleDao roleDao;

    @Override
    public UserInfo findByUsername(String username) {
        UserInfo userInfo = userDao.selectByUsername(username);
        if (ObjectUtils.isEmpty(userInfo)) {
            throw new BaseException(ResultEnum.USER_NOT_EXIST);
        }
        return userInfo;
    }

    @Override
    public UserInfo find(int id) {
        UserInfo userInfo = userDao.selectByPrimaryKey(id);
        if (ObjectUtils.isEmpty(userInfo)) {
            throw new BaseException(ResultEnum.USER_NOT_EXIST);
        }
        return userInfo;
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
    public void insert(UserInfo userInfo) {
        userDao.insertSelective(userInfo);
    }

    @Override
    public void updateById(UserInfo userInfo) {
        userDao.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public List<RoleInfo> roleList() {
        return roleDao.selectAll();
    }
}
