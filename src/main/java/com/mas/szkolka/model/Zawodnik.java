package com.mas.szkolka.model;

import com.mas.szkolka.model.enums.Status;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="zawodnik")
@Getter
@Setter
public abstract class Zawodnik extends Osoba {

    @Column(unique=true)
    private int nrNaKoszulce;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDate dataPrzyjecia;

    private String pozycja;

    private int wysokoscSkladki=100;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "klub_nazwa", foreignKey = @ForeignKey(name = "fk_zawodnik_klub"))
    private Klub klub;



}
