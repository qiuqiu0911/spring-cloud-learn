package cn.qiudev.cloud.client.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * demo 配置文件
 *
 * @author qiuqiu
 */
@Component
@ConfigurationProperties(prefix = "cloud.client.demo")
@Getter
@Setter
@RefreshScope
public class DemoConfig {

    private String name;

    private String property;

}
