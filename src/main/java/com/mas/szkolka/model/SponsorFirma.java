package com.mas.szkolka.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sponsor_firma")
@Getter
@Setter
public class SponsorFirma extends Sponsor{
}
