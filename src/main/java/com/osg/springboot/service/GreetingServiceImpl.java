package com.osg.springboot.service;

import com.osg.springboot.feign.SmsFeign;
import com.osg.springboot.model.Greeting;
import com.osg.springboot.model.SMS;
import com.osg.springboot.response.GreetingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GreetingServiceImpl implements GreetingService {
    @Autowired
    SmsFeign smsFeignProxy;

    @Override
    public GreetingResponse sendMessage(Greeting greeting, String token) {
        GreetingResponse greetingResponse = new GreetingResponse();
        String ids = "";
        String[] mobiles = greeting.getMobiles().split(",");
        for (String mobile:mobiles) {
            SMS sms = new SMS();
            sms.setMessage(greeting.getMessage());
            sms.setMobile(mobile);
            SMS smsResponse = smsFeignProxy.saveSms(sms);
            ids += smsResponse.getSmsId() + ",";
        }

        greetingResponse.setStatus("ok");
        greetingResponse.setMessage("Message Request Queued");
        greetingResponse.setIds(ids.substring(0, ids.length() - 1));
        return greetingResponse;
    }
}
