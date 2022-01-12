package com.c1x.traits.entity;

import javax.persistence.*;

@Entity
@Table(name = "custom_trait")
public class CustomTrait {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
