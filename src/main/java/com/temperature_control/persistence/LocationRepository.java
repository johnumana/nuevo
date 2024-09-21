package com.temperature_control.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.temperature_control.persistence.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}