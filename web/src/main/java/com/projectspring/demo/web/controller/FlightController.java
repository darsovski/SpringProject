package com.projectspring.demo.web.controller;

import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Flight;
import com.projectspring.demo.service.FlightService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/api/flight", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService=flightService;
    }

    @PostMapping("/create")
    public Flight createFlight(@RequestParam("originAirport") String origin,
                               @RequestParam("destinationAirport") String destination ,
                               @RequestParam("departureDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate departureDate,
                               @RequestParam("returnDate") @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate returnDate,
                               @RequestParam("passengers") int passengers,
                               HttpServletResponse response,
                               UriComponentsBuilder builder) {
        Flight result= flightService.createFlight(origin,destination,departureDate,returnDate,passengers);
        //response.setHeader("PROBA-FLIGHT",builder.path("/api/flight/{flightId}").buildAndExpand(result.getFlight_code()).toUriString());
        return result;
    }

    @GetMapping("/{flight_code}")
    public Flight getFlight(@PathVariable String flight_code) {
        return this.flightService.getFlight(flight_code);
    }

    @PatchMapping("/{flight_code}")
    public Flight updateFlight(@PathVariable Long flight_code,
                               @RequestParam String origin,
                               @RequestParam String destination,
                               @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.TIME) LocalDate departureDate ,
                               @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.TIME) LocalDate returnDate,
                               @RequestParam int passengers) {
        return  this.flightService.updateFlight(origin,destination,departureDate,returnDate,passengers);
    }

    @DeleteMapping("/{flight_code}")
    public void deleteFlight(@PathVariable String flight_code) {
        this.flightService.deleteFlight(flight_code);
    }
}
