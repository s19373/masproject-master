package com.mas.szkolka.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name= "trener")
@Getter
@Setter
public class Trener extends Osoba{

    private LocalDate dataZatrudnienia;
    private int stazPracy;

    private int liczbaGodzin;

    private int stawkaZaGodzine;

    public int getStazPracy(){
        LocalDate today = LocalDate.now();
        Period diff = Period.between(dataZatrudnienia, today);
        stazPracy = diff.getMonths();
        return stazPracy;
    }

    @OneToOne(mappedBy = "trener")
    private Klub klub;

    @Override
    public String toString() {
        return "Trener " + getId() + "{ " + getImie() + " " + getNazwisko() + " " + getEmail() + " " + getNrKontaktowy() + " " +
                "dataZatrudnienia=" + dataZatrudnienia +
                ", stazPracy=" + getStazPracy() +
                ", liczbaGodzin=" + liczbaGodzin +
                ", stawkaZaGodzine=" + stawkaZaGodzine +
                ", klub=" + klub +
                '}';
    }
}
