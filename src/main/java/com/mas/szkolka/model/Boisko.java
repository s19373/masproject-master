package com.mas.szkolka.model;

import com.mas.szkolka.model.enums.Murawa;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
@Getter
@Setter
public class Boisko {

    private String nazwa;

    private Murawa murawa;

    private int maxPojemnosc=1000;

    private int kosztWynajecia;

}
