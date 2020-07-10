package cn.qiudev.cloud.client.controller;

import cn.qiudev.cloud.client.config.DemoConfig;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qiuqiu
 */
@RestController
@Slf4j
public class DemoController {

    @Value("${eureka.instance.instanceId}")
    private String instanceId;

    @Resource
    private DemoConfig config;


    @GetMapping("/config")
    public String config() {
        log.info("{}被调用", instanceId);
        return JSON.toJSONString(config);
    }
}
