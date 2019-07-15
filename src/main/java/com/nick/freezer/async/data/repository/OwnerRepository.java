package com.nick.freezer.async.data.repository;

import com.nick.freezer.async.data.entities.Freezer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Freezer, Long> {
}
