package com.projectspring.demo.repository;

import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;


@Repository
public interface AirportRepository extends JpaRepository<Airport,String> {

    Optional<Airport> findByName(String name);

    Airport getAirportByAirport_code(String code);
}
