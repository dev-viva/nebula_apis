package com.viva.spbt.nebula.nebula_apis.controllers.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello ViVa, first controller call, RELOAD AUTO WORKING FINE!";
    }
}
