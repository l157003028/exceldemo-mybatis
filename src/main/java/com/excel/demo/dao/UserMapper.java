package com.excel.demo.dao;

import com.excel.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * InterfaceName UserMapper
 * Description TODO
 * Author lyk
 * Date 2018/7/19 15:25
 * Version 1.0
 **/
@Mapper
public interface UserMapper {
    int importUser(User user);
    List<User> selectUser();

}
