package com.scaler.bookmyshow.repository;

import com.scaler.bookmyshow.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditSeatRepository extends JpaRepository<Seat , Long> {
}
