package com.osg.springboot.controller;

import com.osg.springboot.model.Greeting;
import com.osg.springboot.response.GreetingResponse;
import com.osg.springboot.response.SmsResponse;
import com.osg.springboot.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @PostMapping("/send")
    public GreetingResponse sendSms(@RequestBody Greeting greeting, @RequestHeader("token") String token) {
        GreetingResponse greetingResponse = greetingService.sendMessage(greeting, token);
        return greetingResponse;
    }
}
