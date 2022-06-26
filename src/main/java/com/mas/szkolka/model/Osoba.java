package com.mas.szkolka.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class Osoba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imie;

    private String nazwisko;

    private String email;

    private String nrKontaktowy;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataUrodzenia;


}
