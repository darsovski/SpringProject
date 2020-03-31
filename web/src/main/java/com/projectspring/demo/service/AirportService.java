package com.projectspring.demo.service;

import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Airports;
import com.projectspring.demo.model.Flight;

import java.util.*;


public interface AirportService {

    Airport createAirport(String name, String country, int passengersPerYear, Set<Flight> flightsTo);

    Airport updateAirport(String country, String oldName, String name, int passengersPerYear, Set<Flight> flightsTo);


    //void addFlight(String to, Flight flight);

    List<Airport> getAllAirports();

    Optional<Airport> findByName(String name);

    void deleteAirport(String airport_code);
}
