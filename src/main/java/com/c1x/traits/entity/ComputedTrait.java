package com.c1x.traits.entity;

import javax.persistence.*;

@Entity
@Table(name = "computed_trait")
public class ComputedTrait {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
