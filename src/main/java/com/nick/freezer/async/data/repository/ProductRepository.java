package com.nick.freezer.async.data.repository;

import com.nick.freezer.async.data.entities.Freezer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Freezer, Long> {
}
