package cn.mywork.sketch.config.realm;

import cn.mywork.sketch.config.utils.JWTUtils;
import cn.mywork.sketch.config.JWTToken;
import cn.mywork.sketch.dao.RoleDao;
import cn.mywork.sketch.pojo.Role;
import cn.mywork.sketch.pojo.User;
import cn.mywork.sketch.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

/**
 * @author: sketch
 * @Date: 2022/1/6 20:47
 */
@Slf4j
public class UserRealm extends AuthorizingRealm {

    @Resource
    UserService userService;
    @Resource
    RoleDao roleDao;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("用户授权...");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        User user = (User) principalCollection.getPrimaryPrincipal();
        Role role = roleDao.selectByPrimaryKey(user.getRoleId());
        authorizationInfo.addRole(role.getName());
        authorizationInfo.addStringPermission(null);
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("用户认证...");

        String token = (String) authenticationToken.getCredentials();
        String username = JWTUtils.getUsername(token);

        if (username == null) {
            throw new AuthenticationException("token异常");
        }
        User userBean = userService.findByUsername(username);

        if (!JWTUtils.verify(token, username, userBean.getPassword())) {
            throw new AuthenticationException("密码错误");
        }
        return new SimpleAuthenticationInfo(userBean, token, getName());
    }
}
