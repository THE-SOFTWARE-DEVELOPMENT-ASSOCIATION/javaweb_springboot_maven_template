package com.bcp.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Main {
    @ResponseBody
    @RequestMapping(value = "/Hello",method = RequestMethod.GET)

public String Hello()
{

    return "Hello";
}
}