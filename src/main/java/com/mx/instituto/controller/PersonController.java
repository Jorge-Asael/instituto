package com.mx.instituto.controller;

import com.mx.instituto.constant.ViewConstant;
import com.mx.instituto.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value = "/persons")
public class PersonController {

    private PersonService personService;

    @GetMapping("/index")
    private ModelAndView index(ModelAndView mav){
        return mav;
    }

    @GetMapping("/showpersons")
    public ModelAndView showPersons(){
        ModelAndView mav = new ModelAndView(ViewConstant.PERSON_INDEX);
        mav.addObject("persons", personService.listAllPersons());
        return mav;
    }
}
