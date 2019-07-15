package com.nick.freezer.async.crud.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FreezerDto {
    private Long id;
    private List<ProductPreviewDto> products;
    private String name;
}
