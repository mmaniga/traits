package com.c1x.traits.repository;

import com.c1x.traits.entity.CustomTrait;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomTraitRepository extends JpaRepository<CustomTrait, Long> {
}