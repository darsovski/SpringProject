package com.projectspring.demo.service.Implementation;

import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Flight;
import com.projectspring.demo.model.exceptions.InvalidAirportNameException;
import com.projectspring.demo.repository.AirportRepository;
import com.projectspring.demo.service.AirportService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AirportServiceImpl implements AirportService {

    private final AirportRepository airportRepository;

    public AirportServiceImpl(AirportRepository airportRepository) {
        this.airportRepository=airportRepository;
    }

    @Override
    public Airport createAirport(String name, String country, int passengersPerYear, Set<Flight> flightsTo) {
             Airport airport=new Airport(name,country,passengersPerYear,flightsTo);
             return this.airportRepository.save(airport);
    }

    @Override
    public Airport updateAirport(String country, String oldName, String name, int passengersPerYear, Set<Flight> flightsTo) {
        Airport airport= this.airportRepository.findByName(oldName).orElseThrow(InvalidAirportNameException::new);
        airport.setName(name);
        airport.setCountry(country);
        airport.setPassengersPerYear(passengersPerYear);
        airport.setFlightsTo(flightsTo);
        return this.airportRepository.save(airport);
    }

    @Override
    public void deleteAirport(String name) {
        this.airportRepository.deleteById(name);
    }

    @Override
    public List<Airport> getAllAirports() {
        return this.airportRepository.findAll();
    }

    @Override
    public Optional<Airport> findByName(String name) { return this.airportRepository.findByName(name); }


   /*@Override
   public void addFlight(String code, Flight flight) {

       Airport airport=this.airportRepository.getAirportByAirport_code(code);
       airport.flightsTo.add(flight);

       this.airportRepository.save(airport);
   }*/

}
