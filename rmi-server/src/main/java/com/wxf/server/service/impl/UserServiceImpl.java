package com.wxf.server.service.impl;

import com.wxf.common.pojo.User;
import com.wxf.common.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * 用户服务Service
 */
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public User selectUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("zhangsan");
        System.out.println("收到客户端请求");
        return user;
    }
}
