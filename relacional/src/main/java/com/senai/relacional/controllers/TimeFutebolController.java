package com.senai.relacional.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.relacional.repositories.TimeFutebolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/time-futebol")
public class TimeFutebolController {

    @Autowired
    TimeFutebolRepository timeFutebolRepository;

    @GetMapping
    public ResponseEntity <?>getTimes() {

        var times = timeFutebolRepository.findAll();

        return ResponseEntity.ok(times);
    }

}
