package cn.qiudev.cloud.usercenter.controller;

import cn.qiudev.cloud.usercenter.domain.User;
import cn.qiudev.cloud.usercenter.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qiuqiu
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("list")
    public List<User> getUserList(){
        return userService.queryUserList();
    }

    @PostMapping("save")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
