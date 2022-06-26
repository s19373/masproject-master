package com.mas.szkolka.service;

import com.mas.szkolka.model.Klub;
import com.mas.szkolka.repository.KlubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KlubService {
    @Autowired
    private KlubRepository klubRepository;

    public List<Klub> getAllKluby(){
        return klubRepository.findAll();
    }

    public Klub getKlubById(long id){
        Optional<Klub> optional = klubRepository.findById(id);
        Klub klub = null;
        if(optional.isPresent()){
            klub = optional.get();
        }else{
            throw new RuntimeException("Klub not found for id: " + id);
        }
        return klub;
    }

}
