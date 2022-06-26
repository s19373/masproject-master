package com.mas.szkolka.service;

import com.mas.szkolka.model.Mecz;
import com.mas.szkolka.model.Trener;
import com.mas.szkolka.repository.MeczRepository;
import com.mas.szkolka.repository.TrenerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SzkolkaService {
    @Autowired
    private final TrenerRepository trenerRepository;
    @Autowired
    private final MeczRepository meczRepository;

    public List<Mecz> listAllMecze() {return meczRepository.findAll();}
    public List<Trener> listAllTrenerzy(){
        return trenerRepository.findAll();
    }
    public void saveTrener(Trener trener){
        this.trenerRepository.save(trener);
    }



}
