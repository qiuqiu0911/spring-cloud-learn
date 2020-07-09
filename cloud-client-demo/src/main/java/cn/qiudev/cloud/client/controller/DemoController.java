package cn.qiudev.cloud.client.controller;

import cn.qiudev.cloud.client.config.DemoConfig;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qiuqiu
 */
@RestController
public class DemoController {

    @Resource
    private DemoConfig config;


    @GetMapping("/config")
    public String config(){
        return JSON.toJSONString(config);
    }
}
