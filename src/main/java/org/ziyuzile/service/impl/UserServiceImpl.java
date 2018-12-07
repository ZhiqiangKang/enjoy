package org.ziyuzile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.ziyuzile.constant.CacheName;
import org.ziyuzile.mapper.UserMapper;
import org.ziyuzile.model.User;
import org.ziyuzile.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(CacheName.USER)
    public User queryUserById(String id) {

        User user = userMapper.queryByPK(id);

        return user;
    }

    @Override
    public User addUser(User user) {
        userMapper.add(user);
        return user;
    }
}
