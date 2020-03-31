package com.projectspring.demo.web.controller;

import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Flight;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class AirportsController {



      /*  @Override
    public void addFlights(String origin, String destination , LocalDate departureDate, LocalDate returnDate, int passengers) {
        Map<String,Airport> airportMap=airportsRepository.getMap();

        airportMap.computeIfPresent(origin, (key,value) -> {
            value.addFlight(destination, new Flight(origin,destination,departureDate,returnDate,passengers));
            return value;
        });
    }*/

    @Override
    public void showFlightsFromAirport(String code) {
        Set<Airport> airportMap=getSetAirports();

     /*   Airport airport = airportMap.get(code);
        System.out.println(airport);
        int index =1;
        for (String to : airport.flightsTo.keySet()) {
            for (Flight flight : airport.flightsTo.get(to)) {
                System.out.printf("%d. %s\n",index++,flight);
            }
        };

        Set<Airport> airportSet=this.getSetAirports();

        int index=1;
        for (String code : airportSet.fl);*/

    }

    @Override
    public void showDirectFlightsTo(String to) {

        Map<String,Airport> airportMap=airportsRepository.getMap();

        TreeSet<Flight> flightsTo = new TreeSet<>();
        airportMap.values().stream()
                .filter( each -> each.flightsTo.get(to) != null)
                .forEach(each -> each.flightsTo.get(to).stream()
                        .forEach(flight -> flightsTo.add(flight)));

        flightsTo.stream()
                .forEach(System.out::println);

    }

    @Override
    public void showDirectFlightsFromTo(String from, String to) {

        Map<String,Airport> airportMap=airportsRepository.getMap();

        TreeSet<Flight> flightsTo = new TreeSet<>();
        airportMap.values().stream()
                .filter( each -> each.flightsTo.get(to) != null)
                .forEach(each -> each.flightsTo.get(to).stream()
                        .forEach(flight -> flightsTo.add(flight)));

        flightsTo.stream()
                .forEach(System.out::println);
    }
}
