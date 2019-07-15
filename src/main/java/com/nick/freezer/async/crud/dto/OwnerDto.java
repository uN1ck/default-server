package com.nick.freezer.async.crud.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class OwnerDto {
    private final Long id;
    private final String name;
    private final Map<String, Long> freezers;
}
