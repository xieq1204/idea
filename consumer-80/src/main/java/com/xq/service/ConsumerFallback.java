package com.xq.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ConsumerFallback implements IConsummer{

    /**
     * 失败后降级
     */
    @Override
    public void print() {
        System.out.println("服务已经降级");
    }
}
