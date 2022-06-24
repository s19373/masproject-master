package com.mas.szkolka.model;

import com.mas.szkolka.model.enums.RodzajZajec;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class ZawodnikU10 extends Zawodnik{
    private String nrDoRodziców;

    private RodzajZajec rodzajZajec;
}
