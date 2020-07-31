package cn.qiudev.cloud.usercenter.service;

import cn.qiudev.cloud.usercenter.domain.User;

import java.util.List;

/**
 * @author qiuqiu
 */
public interface UserService {

    /**
     * 查询用户列表
     *
     * @return 用户信息List
     */
    List<User> queryUserList();

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return 新增完成的用户信息
     */
    User saveUser(User user);
}
