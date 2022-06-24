package com.mas.szkolka.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="klub")
@Getter
@Setter
public class Klub {

    @Id
    private String nazwa;

    private String lokalizacja;

    private String nrTelefonu;

    private int minLiczbaZawodnikow=11;

    private int maxLiczbaZawodnikow=50;

    private String liga;

    @OneToMany(mappedBy = "klub")
    private Set<Zawodnik> zawodnicy;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "trener_id", foreignKey = @ForeignKey(name = "fk_klub_trener"))
    private Trener trener;

    @ManyToMany(mappedBy = "kluby")
    private Set<SponsorPrywatny> sponsorzy;

    @OneToMany(mappedBy="klub")
    private Set<Mecz> mecze;

}
