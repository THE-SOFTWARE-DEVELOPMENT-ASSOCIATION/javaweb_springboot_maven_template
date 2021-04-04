package com.bcp.Controller;

import com.bcp.Model.TestModel;
import com.bcp.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Scope("prototype")
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testServ;

    @GetMapping(value = "/select")
    @ResponseBody
    public List<TestModel> select() throws Exception {
        return testServ.select();
    }
}
