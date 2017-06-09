package com.matthew.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by matthewchik on 8/6/2017.
 */

//https://www.genuitec.com/spring-frameworkrestcontroller-vs-controller/
//@RestController - no longer to add @ResponseBody to all the request mapping methods
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
