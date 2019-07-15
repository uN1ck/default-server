package com.nick.freezer.async.crud.controllers;

import com.nick.freezer.async.data.actions.CurrentOwnerActions;
import com.nick.freezer.async.crud.dto.OwnerDto;
import com.nick.freezer.async.data.entities.Freezer;
import com.nick.freezer.async.data.entities.Owner;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/Owner")
@RequiredArgsConstructor
public class OwnerController {

    private final CurrentOwnerActions currentOwnerActions;

    @GetMapping
    public OwnerDto getOwner() {
        Owner owner = currentOwnerActions.getOwner();
        return OwnerDto.builder()
                .id(owner.getId())
                .name(owner.getName())
                .freezers(owner.getFreezers()
                                  .stream()
                                  .collect(Collectors.toMap(Freezer::getName, Freezer::getId)))
                .build();
    }

    @PutMapping
    public void createOwner(@RequestBody OwnerDto ownerDto) {
        currentOwnerActions.createOwner(ownerDto);
    }

    @PostMapping
    public void updateOwner(@RequestBody OwnerDto ownerDto) {
        currentOwnerActions.updateOwner(ownerDto);
    }

    @DeleteMapping("/{id}")
    public void deleteOwner(@PathVariable Long id) {
        currentOwnerActions.deleteOwner(id);
    }

}
