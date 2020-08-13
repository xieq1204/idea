package com.xq.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "PAYMENT-8001",fallback = ConsumerFallback.class)
public interface IConsummer {
    @GetMapping("payment")
     void print();

}
