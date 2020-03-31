package com.projectspring.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "flight_code")
    private String flight_code;

    private String origin;

    private String destination;

    private LocalDate departureDate;

    private LocalDate returnDate;

    private int passengers;

    @ManyToOne()
    private Airport airport;

    @Override
    public String toString() {
        return String.format("%s-%s %s-%s %s", origin, destination, departureDate, returnDate, passengers);
    }

    public Flight(String origin,String destination,LocalDate departureDate,LocalDate returnDate,int passengers) {
        this.origin=origin;
        this.destination=destination;
        this.departureDate=departureDate;
        this.returnDate=returnDate;
        this.passengers=passengers;
    }

}
