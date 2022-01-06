package cn.mywork.sketch.config;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author: sketch
 * @Date: 2022/1/6 20:47
 */
public class JWTToken implements AuthenticationToken {

    private final String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
