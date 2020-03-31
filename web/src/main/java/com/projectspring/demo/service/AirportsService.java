package com.projectspring.demo.service;

import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Airports;
import com.projectspring.demo.model.Flight;

import java.util.Set;

public interface AirportsService {

     Airports addAirport(String name, String country, int passengersPerYear, Set<Flight> flightsTo);

   /*  void showFlightsFromAirport(String code);

     void showDirectFlightsTo(String to);

     void showDirectFlightsFromTo(String from, String to);

     Set<Airport> getSetAirports();*/


}
