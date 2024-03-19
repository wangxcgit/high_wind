package com.sld.high_wind.mapper;

import com.sld.high_wind.Bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{name}")
    public User findByName(String name);

}
