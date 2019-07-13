package com.nick.freezer.async.entities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {
    private final String name;
    private final Double amount;
    private final String metrics;
}
