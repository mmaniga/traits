package com.c1x.traits.repository;

import com.c1x.traits.entity.Trait;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraitRepository extends JpaRepository<Trait, Long> {
}