package com.senai.relacional.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.relacional.entities.TimeFutebol;
import com.senai.relacional.repositories.TimeFutebolRepository;

@Service

public class TimeFutebolService {
    
    @Autowired
    TimeFutebolRepository timeFutebolRepository;
    public List<TimeFutebol> geTtAllTimes(){
        return timeFutebolRepository.findAll();
    }
}
