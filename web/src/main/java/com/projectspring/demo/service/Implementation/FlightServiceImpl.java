package com.projectspring.demo.service.Implementation;

import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Flight;
import com.projectspring.demo.model.exceptions.InvalidAirportNameException;
import com.projectspring.demo.model.exceptions.InvalidFlightNameException;
import com.projectspring.demo.repository.FlightRepository;
import com.projectspring.demo.service.FlightService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {


    private final FlightRepository flightRepository;

    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository=flightRepository;
    }

    @Override
    public Flight createFlight(String origin, String destination, LocalDate departureDate, LocalDate returnDate, int passengers) {
        Flight flight=new Flight(origin,destination,departureDate,returnDate,passengers);
        return this.flightRepository.save(flight);
    }

    @Override
    public Flight updateFlight(String origin, String destination, LocalDate departureDate, LocalDate returnDate, int passengers) {
        Flight flight=this.flightRepository.findByOriginAndDestination(origin,destination).orElseThrow(InvalidFlightNameException::new);
        flight.setOrigin(origin);
        flight.setDestination(destination);
        flight.setDepartureDate(departureDate);
        flight.setReturnDate(returnDate);
        flight.setPassengers(passengers);
        return this.flightRepository.save(flight);
    }

    @Override
    public Flight getFlight(String flight_code) {
        return this.flightRepository.getOne(flight_code);
    }

    @Override
    public List<Flight> getAllFlight() {
        return this.flightRepository.findAll();
    }

    @Override
    public void deleteFlight(String  flight_code) {
        this.flightRepository.deleteById(flight_code);
    }

    @Override
    public Optional<Flight> findByCode(String fight_code) {
        return this.flightRepository.findById(fight_code);
    }

    @Override
    public List<Flight> findByOriginAndDestination(String origin, String destination) {
        return this.flightRepository.findByOriginAndDestination(origin,destination);
    }
}
