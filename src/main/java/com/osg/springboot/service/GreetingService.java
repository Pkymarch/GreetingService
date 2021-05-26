package com.osg.springboot.service;

import com.osg.springboot.model.Greeting;
import com.osg.springboot.response.GreetingResponse;




public interface GreetingService {
    GreetingResponse sendMessage(Greeting greeting, String token);
}
