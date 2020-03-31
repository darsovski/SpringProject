package com.projectspring.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "package_id")
    private String package_id;

    private String basic;

    private String medium;

    private String premium;
}
