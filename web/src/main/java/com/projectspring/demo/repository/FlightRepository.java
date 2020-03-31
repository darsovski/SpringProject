package com.projectspring.demo.repository;

import com.projectspring.demo.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository<Flight,String> {

    @Query("select s.origin,s.destination from Flight s")
    List<Flight> findByOriginAndDestination(String origin, String destination);

}
