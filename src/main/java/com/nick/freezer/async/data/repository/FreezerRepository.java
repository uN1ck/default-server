package com.nick.freezer.async.data.repository;

import com.nick.freezer.async.data.entities.Freezer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreezerRepository extends JpaRepository<Freezer, Long> {
}
