package com.xq.controller;

import com.xq.service.IConsummer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeinController {
    @Resource
    private IConsummer c;
    @GetMapping("fein")
    public void print(){
        c.print();
    }
}
