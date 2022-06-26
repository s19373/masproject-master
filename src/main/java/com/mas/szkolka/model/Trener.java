package com.mas.szkolka.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Entity
@Table(name= "trener")
@Getter
@Setter
public class Trener extends Osoba{

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataZatrudnienia;
    private long stazPracy;

    private int liczbaGodzin;

    private int stawkaZaGodzine;

    public long getStazPracy(){
        Date date = new Date();
        stazPracy = getDateDiff(dataZatrudnienia,date,TimeUnit.DAYS);
        return stazPracy/30;
    }

    @OneToOne(mappedBy = "trener")
    private Klub klub;

    @Override
    public String toString() {
        return "Trener " + getId() + "{ " + getImie() + " " + getNazwisko() + " " + getEmail() + " " + getNrKontaktowy() + " " +
                "dataZatrudnienia=" + dataZatrudnienia +
                ", stazPracy=" + getStazPracy() +
                ", liczbaGodzin=" + liczbaGodzin +
                ", stawkaZaGodzine=" + stawkaZaGodzine +
                ", klub=" + klub +
                '}';
    }


    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }
}
