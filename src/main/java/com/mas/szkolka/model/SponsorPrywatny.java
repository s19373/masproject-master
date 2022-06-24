package com.mas.szkolka.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="sponsor_prywatny")
@Getter
@Setter
public class SponsorPrywatny extends Sponsor{

    @ManyToMany
    @JoinTable(
            name = "sponsorprywatny_klub",
            joinColumns = {@JoinColumn(name="sponsorprywatny_id",foreignKey = @ForeignKey(name="fk_klub_sponsorprywatny"))},
            inverseJoinColumns = {@JoinColumn(name="klub_id",foreignKey = @ForeignKey(name="fk_sponsorprywatny_klub"))}
    )
    private Set<Klub> kluby;


}