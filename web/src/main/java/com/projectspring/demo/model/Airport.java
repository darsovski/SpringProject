package com.projectspring.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "airport_code")
    private String airport_code;

    private String name;

    private String country;

    int passengersPerYear;

    @ManyToOne
    private Airports AirportsSet;

    @OneToMany(mappedBy = "airport")
    public Set<Flight> flightsTo;


    public Airport(String name , String country, int passengersPerYear,Set<Flight> flightsTo) {
        this.name=name;
        this.country=country;
        this.passengersPerYear=passengersPerYear;
        this.flightsTo=new TreeSet<>();
    }

   public void addFlight( Flight flight) {
        flightsTo.add(flight);
    }

    @Override
    public String toString() {
        return String.format("%s (%s)\n%s\n%d", name,airport_code,country,passengersPerYear);
    }

    public Set<Flight>  getFlightsTo() {
        return this.flightsTo;
    }


}
