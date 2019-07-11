package com.example.demo.pow;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowProviderImplTest {

    private PowProvider powProvider = new PowProviderImpl();

    @Test
    public void getPowFromTwo() {
        int value = powProvider.getPow(2);
        Assertions.assertThat(value).isEqualTo(4);
    }

    @Test
    public void getPowFromTen() {
        int value = powProvider.getPow(10);
        Assertions.assertThat(value).isEqualTo(100);
    }

}