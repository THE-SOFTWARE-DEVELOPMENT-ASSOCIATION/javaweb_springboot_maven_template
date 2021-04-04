package com.bcp.Mapper;

import com.bcp.Model.TestModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {
    @Select("SELECT account_id,username FROM users_account")
    List<TestModel> select();
}
