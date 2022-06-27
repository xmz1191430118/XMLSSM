package com.xue.ssm.dao;

import com.xue.ssm.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xmz
 * @date 2022/6/25 17:31
 */
@Component
public interface UserDao {
    public User getUserById(Integer id);
    public List<User> getAllUser();
}
