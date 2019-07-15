package com.nick.freezer.async.data.actions;

import com.nick.freezer.async.crud.dto.OwnerDto;
import com.nick.freezer.async.data.entities.Owner;

public interface CurrentOwnerActions {
    Owner getOwner();

    void updateOwner(OwnerDto ownerDto);

    void createOwner(OwnerDto ownerDto);

    void deleteOwner(Long id);

}
