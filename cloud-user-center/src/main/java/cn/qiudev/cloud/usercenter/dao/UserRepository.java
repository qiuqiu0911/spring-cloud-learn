package cn.qiudev.cloud.usercenter.dao;

import cn.qiudev.cloud.usercenter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qiuqiu
 */
public interface UserRepository extends JpaRepository<User, String> {
}
