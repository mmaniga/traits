package com.c1x.traits.entity;

import javax.persistence.*;

@Entity
@Table(name ="account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
