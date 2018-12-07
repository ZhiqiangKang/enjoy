package org.ziyuzile.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ziyuzile.model.User;

@Mapper
public interface UserMapper {

    User queryByPK(String id);

    int add(User user);
}
