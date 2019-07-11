package com.example.demo.pow;

import org.springframework.stereotype.Service;

@Service
public class PowProviderImpl implements PowProvider {
    public int getPow(int value) {
        return value * value;
    }
}
