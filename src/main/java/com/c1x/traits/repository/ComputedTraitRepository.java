package com.c1x.traits.repository;

import com.c1x.traits.entity.ComputedTrait;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputedTraitRepository extends JpaRepository<ComputedTrait, Long> {
}