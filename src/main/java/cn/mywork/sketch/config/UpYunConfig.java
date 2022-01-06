package cn.mywork.sketch.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: sketch
 * @Date: 2021/1/31 17:38
 */
@Component
@ConfigurationProperties("upyun")
@Data
public class UpYunConfig {

    private String bucketName;

    private String username;

    private String password;

    private String imageHost;
}
