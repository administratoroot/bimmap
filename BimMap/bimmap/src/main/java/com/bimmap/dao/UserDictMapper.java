package com.bimmap.dao;

import com.bimmap.model.UserDict;
import com.bimmap.model.UserDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserDictMapper {
    int countByExample(UserDictExample example);

    int deleteByExample(UserDictExample example);

    @Delete({
        "delete from user_dict",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user_dict (id, username, ",
        "password, role, ",
        "manage_region)",
        "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{role,jdbcType=INTEGER}, ",
        "#{manageRegion,jdbcType=INTEGER})"
    })
    int insert(UserDict record);

    int insertSelective(UserDict record);

    List<UserDict> selectByExample(UserDictExample example);

    @Select({
        "select",
        "id, username, password, role, manage_region",
        "from user_dict",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    UserDict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDict record, @Param("example") UserDictExample example);

    int updateByExample(@Param("record") UserDict record, @Param("example") UserDictExample example);

    int updateByPrimaryKeySelective(UserDict record);

    @Update({
        "update user_dict",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "role = #{role,jdbcType=INTEGER},",
          "manage_region = #{manageRegion,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserDict record);
    
    UserDict selectUser(int id);
    
    
}