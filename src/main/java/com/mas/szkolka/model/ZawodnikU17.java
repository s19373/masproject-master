package com.mas.szkolka.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class ZawodnikU17 extends Zawodnik{

    private int liczbaGodzinwTreningu;

    private int sredniaOcena;
}
