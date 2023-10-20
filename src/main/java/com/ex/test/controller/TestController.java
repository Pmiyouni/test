package com.ex.test.controller;


import com.ex.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller


public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping("/test")
    public String test(@RequestParam("name") String name){
        String name1 = testService.insert(name);
        System.out.println(name1);
        return "index";
    }
}
