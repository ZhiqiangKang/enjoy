package org.ziyuzile.service;

import org.ziyuzile.model.User;

public interface UserService {

    User queryUserById(String id);

    User addUser(User user);
}
