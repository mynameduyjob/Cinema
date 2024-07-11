package com.example.MovieTicket.repository;

import com.example.MovieTicket.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
