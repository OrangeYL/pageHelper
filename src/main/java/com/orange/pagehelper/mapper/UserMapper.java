package com.orange.pagehelper.mapper;

import com.orange.pagehelper.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> listAllUser();
}
