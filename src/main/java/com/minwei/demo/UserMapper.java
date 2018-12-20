package com.minwei.demo;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Mapper
public interface  UserMapper{

    @Select("SELECT * FROM T_USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO T_USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
