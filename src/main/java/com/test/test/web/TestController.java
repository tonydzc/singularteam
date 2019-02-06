package com.test.test.web;

import com.test.test.domain.Test;
import com.test.test.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService){
        this.testService=testService;
    }

    @GetMapping("/find-all")
    public List<Test> getString(){
        return testService.findAll();
    }

}
