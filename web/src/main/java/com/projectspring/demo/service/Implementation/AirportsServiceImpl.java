package com.projectspring.demo.service.Implementation;


import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Airports;
import com.projectspring.demo.model.Flight;
import com.projectspring.demo.repository.AirportsRepository;
import com.projectspring.demo.service.AirportsService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

@Service
public class AirportsServiceImpl implements AirportsService {

    private final AirportsRepository airportsRepository;

    public AirportsServiceImpl(AirportsRepository airportsRepository) { this.airportsRepository = airportsRepository; }

    @Override
    public Airports addAirport(String name, String country, int passengersPerYear, Set<Flight> flightsTo) {
        Airport airport=new Airport(name,country,passengersPerYear,flightsTo);
       // return this.airportsRepository.save(airport);
        Set<Airport> airportsSet=new TreeSet<>();
        airportsSet.add(airport);
       return this.airportsRepository.save(airportsSet);
    }



}
