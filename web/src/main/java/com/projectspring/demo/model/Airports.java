package com.projectspring.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
public class Airports  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "airport_code")
    private String airport_code;

    @OneToMany(mappedBy = "AirportsSet")
    public Set<Airport> airports;

    public Airports () {
        this.airports=new TreeSet<>();
    }

    public  Set<Airport> getSetAirports() {
        return this.airports;
    }

    public String getCode() { return this.airport_code; }


}
