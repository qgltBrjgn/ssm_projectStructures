package com.qglt.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qingt on 2019/6/25.
 */
@Controller
public class TestController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
