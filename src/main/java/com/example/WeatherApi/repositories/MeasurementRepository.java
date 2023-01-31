package com.example.WeatherApi.repositories;

import com.example.WeatherApi.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
