package com.mas.szkolka.model;

import com.mas.szkolka.model.enums.Murawa;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Boisko {

    private String nazwa;

    private Murawa murawa;

    private int maxPojemnosc=1000;

    private int kosztWynajecia;

}
