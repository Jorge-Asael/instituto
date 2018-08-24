package com.mx.instituto.controller;

import com.mx.instituto.constant.ViewConstant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/Person")
public class PersonController {

    @RequestMapping("/index")
    public String index(){
        return ViewConstant.PERSON_INDEX;
    }
}
