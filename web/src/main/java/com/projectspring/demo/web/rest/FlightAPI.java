/*
package com.projectspring.demo.web.rest;

import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Flight;
import com.projectspring.demo.service.FlightService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/api/flight", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class FlightAPI {

    private final FlightService flightService;

    public FlightAPI(FlightService flightService) {
        this.flightService=flightService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Flight createFlight(@RequestParam("originAirport") String origin,
                               @RequestParam("destinationAirport") String destination ,
                               @RequestParam("departureDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate departureDate,
                               @RequestParam("returnDate") @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate returnDate,
                               @RequestParam("passengets") int passengers,
                               @RequestParam("airportList") List<Airport> airportList,
                               HttpServletResponse response,
                               UriComponentsBuilder builder) {
        Flight result= flightService.createFlight(origin,destination,departureDate,returnDate,passengers,airportList);
        response.setHeader("PROBA-FLIGHT",builder.path("/api/flight/{flightId}").buildAndExpand(result.getFlight_code()).toUriString());
        return result;
    }

    @GetMapping("/{flight_code}")
    public Flight getFlight(@PathVariable Long flight_code) {
        return this.flightService.getFlight(flight_code);
    }

    @PatchMapping("/{flight_code}")
    public Flight updateFlight(@PathVariable Long flight_code,
                               @RequestParam String origin,
                               @RequestParam String destination,
                               @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.TIME) LocalDate departureDate ,
                               @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.TIME) LocalDate returnDate,
                               @RequestParam int passengers,
                               @RequestParam("airportList") List<Airport> airportList) {
        return  this.flightService.updateFlight(origin,destination,departureDate,returnDate,passengers);
    }


    @DeleteMapping("/{flightID}")
    public void deleteFlight(@PathVariable Long flight_code) {
        this.flightService.deleteFlight(flight_code);
    }

}
*/
