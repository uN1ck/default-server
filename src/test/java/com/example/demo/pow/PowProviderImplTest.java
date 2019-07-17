package com.example.demo.pow;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowProviderImplTest {

    private PowProvider powProvider = new PowProviderImpl();

    @Test
    public void getPowFromTwo() {
        int value = powProvider.getPow(2);
        Assertions.assertEquals(4, value);
    }

    @Test
    public void getPowFromTen() {
        int value = powProvider.getPow(10);
        Assertions.assertEquals(100, value);
    }

//    @Test
//    public void getPowFromTenFails() {
//        int value = powProvider.getPow(10);
//        Assertions.assertEquals(122, value);
//    }


}