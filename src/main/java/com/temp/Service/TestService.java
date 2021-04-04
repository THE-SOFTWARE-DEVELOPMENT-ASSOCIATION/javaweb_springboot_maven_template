package com.bcp.Service;

import com.bcp.Mapper.TestMapper;
import com.bcp.Model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TestService {

@Autowired

    private TestMapper testMapper;
    public List<TestModel> select(){
        return testMapper.select();
    }
}
