package com.xq.controller;

import com.xq.service.IPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class paymentController {
    @Autowired
    private IPayment payment;
    @GetMapping("/get")
    public void print(){
        payment.print();
    }
}
