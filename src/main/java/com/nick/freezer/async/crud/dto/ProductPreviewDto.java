package com.nick.freezer.async.crud.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductPreviewDto {
    private final Long id;
    private final String name;
    private final Double amount;
}
