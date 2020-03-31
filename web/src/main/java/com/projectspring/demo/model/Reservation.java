package com.projectspring.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "baggage_id")
    private String id;

    private String firstName;

    private String lastName;

    private String gender;

    private String baggage;
}
