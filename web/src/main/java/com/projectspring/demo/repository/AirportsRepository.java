package com.projectspring.demo.repository;

import com.projectspring.demo.model.Airport;
import com.projectspring.demo.model.Airports;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface AirportsRepository extends JpaRepository<Airports,String> { }
