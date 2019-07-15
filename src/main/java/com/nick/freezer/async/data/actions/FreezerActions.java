package com.nick.freezer.async.data.actions;

import com.nick.freezer.async.crud.dto.FreezerDto;

import java.util.List;

public interface FreezerActions {
    List<FreezerDto> getAllFreezers();

    FreezerDto getConcreteFreezer(Long id);
}
