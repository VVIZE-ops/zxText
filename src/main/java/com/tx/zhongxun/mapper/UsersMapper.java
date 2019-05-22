package com.tx.zhongxun.mapper;

import com.tx.zhongxun.pojo.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from users")
    List<Users> getUsersList();

    @Insert("insert into users (mobName,userName,nickname,phone,register) " +
            "values (#{mobName},#{userName},#{nickname},#{phone},#{register}) ")
    public int add(Users users);

    @Delete(" delete from users where id= #{id} ")
    public void del(int id);

    @Select("select * from users where id= #{id} ")
    public Users getUser(int id);

    @Update("update users set " +
            "mobName = #{mobName}," +
            "userName = #{userName}," +
            "nickname = #{nickname}," +
            "phone = #{phone}," +
            "register = #{register} " +
            "where id=#{id} ")
    public int update(Users users);

}