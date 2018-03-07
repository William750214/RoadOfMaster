package com.heynas.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * <p> Description:  ThymeleafController </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @RequestMapping("/sayHello")
    public String sayHello(Map<String,Object> map) {
        map.put("hello","Hello Thymeleaf!");

        return "/thymeleaf";
    }
}
