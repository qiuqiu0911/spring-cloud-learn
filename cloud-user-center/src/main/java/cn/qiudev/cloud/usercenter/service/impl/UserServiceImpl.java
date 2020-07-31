package cn.qiudev.cloud.usercenter.service.impl;

import cn.qiudev.cloud.usercenter.dao.UserRepository;
import cn.qiudev.cloud.usercenter.domain.User;
import cn.qiudev.cloud.usercenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qiuqiu
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    /**
     * 查询用户列表
     *
     * @return 用户信息List
     */
    @Override
    public List<User> queryUserList() {
        return userRepository.findAll();
    }

    /**
     * 新增用户
     *
     * @param user 用户信息
     */
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
