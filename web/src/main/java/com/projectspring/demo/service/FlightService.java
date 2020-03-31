package com.projectspring.demo.service;

import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Flight;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public interface FlightService  {

    Flight createFlight(String origin, String destination , LocalDate departureDate, LocalDate returnDate, int passengers);

    Flight getFlight(String flight_code);

    List<Flight> getAllFlight();

    Flight updateFlight(String origin, String destination , LocalDate departureDate, LocalDate returnDate, int passengers);

    void deleteFlight(String flight_code);

    Optional<Flight> findByCode(String fight_code);

    List<Flight> findByOriginAndDestination(String origin,String destination);
}
