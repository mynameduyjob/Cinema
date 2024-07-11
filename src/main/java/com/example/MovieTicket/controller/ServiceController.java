package com.example.MovieTicket.controller;

import com.example.MovieTicket.entity.Service;
import com.example.MovieTicket.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    ServiceRepository repo;
    @GetMapping("/service")
    public List<Service> getAllServices() {
        List<Service> services = repo.findAll();
        return services;
    }

    @GetMapping("/service/{id}")
    public Service getService(@PathVariable int id) {
        Service service = repo.findById(id).get();
        return service;
    }

    @PostMapping("/service/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createService(@RequestBody Service service) {
        repo.save(service);
    }

    @PutMapping("/service/update/{id}")
    public Service updateServices(@PathVariable int id) {
        Service service = repo.findById(id).get();
        service.setService_name("");
        service.setPainted("");
        service.setPrice(0);
        repo.save(service);
        return service;
    }

    @DeleteMapping("/service/delete/{id}")
    public void removeService(@PathVariable int id) {
        Service service = repo.findById(id).get();
        repo.delete(service);
    }
}
