package com.mas.szkolka.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@MappedSuperclass
public abstract class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataRozpoczeciaWspolpracy;

    private int okresWsparcia;

    public int getokresWsparcia(){
        LocalDate today = LocalDate.now();
        Period diff = Period.between(dataRozpoczeciaWspolpracy, today);
        okresWsparcia = diff.getMonths();
        return okresWsparcia;
    }
}
