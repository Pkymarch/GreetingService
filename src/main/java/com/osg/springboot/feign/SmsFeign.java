package com.osg.springboot.feign;


import com.osg.springboot.model.SMS;
import com.osg.springboot.response.SmsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "sms-service", url = "localhost:3003")
public interface SmsFeign {
    @PostMapping("/sms/save")
    public SMS saveSms(@RequestBody SMS sms);
}
