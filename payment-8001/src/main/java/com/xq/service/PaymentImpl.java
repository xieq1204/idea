package com.xq.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentImpl implements IPayment {
    @Override
    public void print() {
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //int x = 10 /0;
        System.out.println("ssssss");
    }
}
