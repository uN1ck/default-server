package com.example.demo.controller;

import com.example.demo.pow.PowProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DemoController {
    private final PowProvider powProvider;


    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }

    @RequestMapping("/pow")
    public String getPow(@RequestParam int value) {
        return String.valueOf(powProvider.getPow(value));
    }
}
