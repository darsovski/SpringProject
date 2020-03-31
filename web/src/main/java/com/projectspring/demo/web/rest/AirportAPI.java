/*
package com.projectspring.demo.web.rest;


import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Flight;
import com.projectspring.demo.service.AirportService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.activation.MimeType;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

@RestController
@RequestMapping(value = "/api/airports",produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class AirportAPI {

    private final AirportService airportService;

    public AirportAPI(AirportService airportService) {
        this.airportService=airportService;
    }


    @PostMapping
    public Airport createAirport(@RequestParam String name, @RequestParam String country, @RequestParam int passengersPerYear,@RequestParam Map<String, TreeSet<Flight>> flightsTo) {
        Airport result=airportService.createAirport(name,country,passengersPerYear,flightsTo);
        return result;
    }

    @PatchMapping("/{airportId}")
    public Airport updateAirport(@RequestParam Long airportId,@RequestParam String oldName,@RequestParam String name, @RequestParam String country, @RequestParam int passengersPerYear,@RequestParam Map<String, TreeSet<Flight>> flightsTo) {
         return  this.airportService.updateAirport(country,name,oldName,passengersPerYear,flightsTo);
    }

    @GetMapping("/{airportId}")
    public Airport getAirport(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{airportId}")
    public void deleteAirport(@PathVariable String name) {
        this.airportService.deleteAirport(name);
    }

}
*/
