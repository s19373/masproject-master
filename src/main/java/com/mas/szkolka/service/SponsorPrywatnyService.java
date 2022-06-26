package com.mas.szkolka.service;

import com.mas.szkolka.model.SponsorPrywatny;
import com.mas.szkolka.repository.SponsorPrywatnyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SponsorPrywatnyService {

    @Autowired
    private SponsorPrywatnyRepository sponsorPrywatnyRepository;

    public List<SponsorPrywatny> getAllSponsorzy(){
        return sponsorPrywatnyRepository.findAll();
    }

    public SponsorPrywatny getSponsorById(long id){
        Optional<SponsorPrywatny> optional = sponsorPrywatnyRepository.findById(id);
        SponsorPrywatny sponsorPrywatny = null;
        if(optional.isPresent()){
            sponsorPrywatny=optional.get();
        }else {
            throw new RuntimeException("Sponsor not found for id: "+id);
        }
        return sponsorPrywatny;
    }

}
