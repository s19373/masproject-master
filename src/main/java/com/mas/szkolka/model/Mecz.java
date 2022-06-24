package com.mas.szkolka.model;

import com.mas.szkolka.model.enums.StatusMeczu;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="mecz")
@Getter
@Setter
public class Mecz {

    @Embedded
    private Boisko boisko;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;

    private StatusMeczu statusMeczu;

    private String wynik;

    @ElementCollection
    private Collection<String> lastName = new ArrayList<String>();

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="klub_id",foreignKey = @ForeignKey(name="fk_mecz_klub"))
    private Klub klub;
}
