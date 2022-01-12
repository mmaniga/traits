package com.c1x.traits.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "trait")
public class Trait {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(columnDefinition = "ENUM('Custom', 'Computed')")
    @Enumerated(EnumType.STRING)
    private TraitType traitType;

    @Column(columnDefinition = "ENUM('Number', 'Any','Array')")
    @Enumerated(EnumType.STRING)
    private TraitTypeValue traitTypeValue;

    @Column(name ="description", nullable = true )
    private String description;

    @Column(name = "account_id", nullable = false)
    private Long accountId;

    @Column(columnDefinition = "ENUM('Number', 'Any','Array')")
    @Enumerated(EnumType.STRING)
    private Status status;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime updatedAt;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime updatedBt;



}
