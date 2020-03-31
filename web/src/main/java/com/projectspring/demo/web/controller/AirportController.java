package com.projectspring.demo.web.controller;

import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Flight;
import com.projectspring.demo.service.AirportService;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/api/airport", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class AirportController {

    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService=airportService;
    }

      /*  @GetMapping("/airport")
    public String showRooms(HttpServletRequest request, @RequestParam(required = false) String country) {
        List<Airport> airports = country == null || country.isEmpty() ?
                this.airportService.getAllAirports() : this.airportService.searchAirports(country);
        Map<String, List<Airport>> airportStream = airports.stream().collect(Collectors.groupingBy(Airport:: getCountry));

        request.setAttribute("rooms", airports);
        request.setAttribute("airportMap", airportStream);
        request.setAttribute("bodyContent", "rooms");
        request.setAttribute("query", country);
        return "master-template";
    }*/

    @PostMapping("/create")
    public Airport createAirport(@RequestParam String name ,
                                 @RequestParam String country,
                                 @RequestParam int passengersPerYear,
                                 @RequestParam Map<String, TreeSet<Flight>> flightsTo)  {
       return this.airportService.createAirport(name,country,passengersPerYear,flightsTo);
    }

    @GetMapping("/{airport_name}")
    public Optional<Airport> getAirport(@RequestParam String name) {
       return this.airportService.findAirport(name);
    }

    @PostMapping("/{oldname}")
    public Airport updateAirport(@RequestParam  String country ,
                                @PathVariable  String oldName,
                                @RequestParam String name,
                                @RequestParam int passengersPerYear,
                                 @RequestParam Map<String, TreeSet<Flight>> flightsTo) {
        return this.airportService.updateAirport(country,oldName,name,passengersPerYear,flightsTo);
    }

    @DeleteMapping("/{airport_name}")
    public void deleteAirport(@PathVariable String name) { this.airportService.deleteAirport(name); }

}

