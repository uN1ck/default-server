package com.nick.freezer.async.entities;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Owner {
    private final List<Product> products;
    private final String name;
}
