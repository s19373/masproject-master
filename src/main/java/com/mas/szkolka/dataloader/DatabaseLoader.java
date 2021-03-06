package com.mas.szkolka.dataloader;

import com.mas.szkolka.model.*;
import com.mas.szkolka.model.enums.RodzajZajec;
import com.mas.szkolka.model.enums.Status;
import com.mas.szkolka.model.enums.StatusMeczu;
import com.mas.szkolka.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

@Component
@RequiredArgsConstructor
public class DatabaseLoader implements CommandLineRunner {

    private final TrenerRepository trenerRepository;
    private final MeczRepository meczRepository;
    private final KlubRepository klubRepository;

    private final SponsorPrywatnyRepository sponsorPrywatnyRepository;
    private final ZawodnikRepository zawodnikRepository;

    @Override
    public void run(String... args) throws Exception {


        Trener trener1 = new Trener();
        trener1.setImie("Jan");
        trener1.setNazwisko("Kowalski");
        trener1.setEmail("jankow@gmail.com");
        trener1.setNrKontaktowy("539-602-202");
        trener1.setDataUrodzenia(new GregorianCalendar(1998, Calendar.FEBRUARY, 11).getTime());
        trener1.setDataZatrudnienia(new GregorianCalendar(2012, Calendar.JANUARY, 16).getTime());
        trener1.setLiczbaGodzin(50);
        trener1.setStawkaZaGodzine(150);

        Trener trener2 = new Trener();
        trener2.setImie("Piotr");
        trener2.setNazwisko("Kowalski");
        trener2.setEmail("piotrkow@gmail.com");
        trener2.setNrKontaktowy("539-602-202");
        trener2.setDataUrodzenia(new GregorianCalendar(1998, Calendar.MARCH, 12).getTime());
        trener2.setDataZatrudnienia(new GregorianCalendar(2014, Calendar.FEBRUARY, 22).getTime());
        trener2.setLiczbaGodzin(50);
        trener2.setStawkaZaGodzine(150);

        Trener trener3 = new Trener();
        trener3.setImie("Adam");
        trener3.setNazwisko("Adamski");
        trener3.setEmail("adam@gmail.com");
        trener3.setNrKontaktowy("539-602-202");
        trener3.setDataUrodzenia(new GregorianCalendar(1989, Calendar.DECEMBER, 1).getTime());
        trener3.setDataZatrudnienia(new GregorianCalendar(2022, Calendar.FEBRUARY, 11).getTime());
        trener3.setLiczbaGodzin(50);
        trener3.setStawkaZaGodzine(150);


        trenerRepository.save(trener1);
        trenerRepository.save(trener2);
        trenerRepository.save(trener3);

        SponsorPrywatny sponsor1 = new SponsorPrywatny();
        sponsor1.setDataRozpoczeciaWspolpracy(LocalDate.of(2009,3,7));

        SponsorPrywatny sponsor2 = new SponsorPrywatny();
        sponsor2.setDataRozpoczeciaWspolpracy(LocalDate.of(2022,5,16));

        SponsorPrywatny sponsor3 = new SponsorPrywatny();
        sponsor3.setDataRozpoczeciaWspolpracy(LocalDate.of(2019,12,21));

        SponsorPrywatny sponsor4 = new SponsorPrywatny();
        sponsor4.setDataRozpoczeciaWspolpracy(LocalDate.of(2016,11,1));



        ZawodnikU10 zawodnik = new ZawodnikU10();
        zawodnik.setNrKontaktowy("424-424-424");
        zawodnik.setEmail("tralala@gmail.com");
        zawodnik.setImie("Janek");
        zawodnik.setNazwisko("Adamek");
        zawodnik.setDataPrzyjecia(LocalDate.of(2021,9,1));
        zawodnik.setNrNaKoszulce(7);
        zawodnik.setPozycja("Lewe skrzyd??o");
        zawodnik.setStatus(Status.AKTYWNY);
        zawodnik.setWysokoscSkladki(100);
        zawodnik.setNrDoRodzic??w("999-991-992");
        zawodnik.setRodzajZajec(RodzajZajec.FUN);


        ZawodnikU10 zawodnik2 = new ZawodnikU10();
        zawodnik2.setNrKontaktowy("454-666-999");
        zawodnik2.setEmail("kowal@gmail.com");
        zawodnik2.setImie("Bob");
        zawodnik2.setNazwisko("Kowalski");
        zawodnik2.setDataPrzyjecia(LocalDate.of(2021,10,1));
        zawodnik2.setNrNaKoszulce(10);
        zawodnik2.setPozycja("Lewe skrzyd??o");
        zawodnik2.setStatus(Status.AKTYWNY);
        zawodnik2.setWysokoscSkladki(100);
        zawodnik2.setNrDoRodzic??w("999-991-992");
        zawodnik2.setRodzajZajec(RodzajZajec.FUN);

        ZawodnikU10 zawodnik3 = new ZawodnikU10();
        zawodnik3.setNrKontaktowy("666-666-888");
        zawodnik3.setEmail("lwey@gmail.com");
        zawodnik3.setImie("M??ody");
        zawodnik3.setNazwisko("Lewandowski");
        zawodnik3.setDataPrzyjecia(LocalDate.of(2021,10,1));
        zawodnik3.setNrNaKoszulce(9);
        zawodnik3.setPozycja("Napastnik");
        zawodnik3.setStatus(Status.AKTYWNY);
        zawodnik3.setWysokoscSkladki(100);
        zawodnik3.setNrDoRodzic??w("999-991-992");
        zawodnik3.setRodzajZajec(RodzajZajec.FUN);



        Boisko boisko1 = new Boisko();
        boisko1.setNazwa("Stadion AWF");
        Boisko boisko2 = new Boisko();
        boisko2.setNazwa("Stadion GKS");

        Mecz mecz1 = new Mecz();
        mecz1.setData(LocalDate.of(2022, 02, 02));
        mecz1.setStatusMeczu(StatusMeczu.ROZEGRANY);
        mecz1.setWynik("2:1");
        mecz1.setBoisko(boisko1);
        mecz1.setLastName(Set.of(zawodnik.getNazwisko(),zawodnik3.getNazwisko(),zawodnik2.getNazwisko()));


        Mecz mecz2 = new Mecz();
        mecz2.setData(LocalDate.of(2022, 02, 10));
        mecz2.setStatusMeczu(StatusMeczu.ROZEGRANY);
        mecz2.setWynik("1:1");
        mecz2.setBoisko(boisko1);
        mecz2.setLastName(Set.of(zawodnik2.getNazwisko(),zawodnik3.getNazwisko()));

        Mecz mecz3 = new Mecz();
        mecz3.setData(LocalDate.of(2022, 06, 28));
        mecz3.setStatusMeczu(StatusMeczu.OCZEKUJACY);
        mecz3.setWynik("0:0");
        mecz3.setBoisko(boisko2);



        Klub klub1 = new Klub();
        klub1.setNazwa("Legia");
        klub1.setLiga("Pierwsza");
        klub1.setLokalizacja("Warszawa");
        klub1.setMecze(Set.of(mecz1));
        klub1.setNrTelefonu("999-999-999");
        klub1.setTrener(trener1);
        klub1.setSponsorzy(Set.of(sponsor1));
        klub1.setZawodnicy(Set.of(zawodnik));

        Klub klub2 = new Klub();
        klub2.setNazwa("Gwardia");
        klub2.setLiga("Druga");
        klub2.setLokalizacja("Warszawa");
        klub2.setMecze(Set.of(mecz2));
        klub2.setNrTelefonu("999-999-999");
        klub2.setTrener(trener2);
        klub2.setSponsorzy(Set.of(sponsor1));
        klub2.setZawodnicy(Set.of(zawodnik));

        Klub klub3 = new Klub();
        klub3.setNazwa("Akademia");
        klub3.setLiga("Trzecia");
        klub3.setLokalizacja("Warszawa");
        klub3.setMecze(Set.of(mecz3));
        klub3.setNrTelefonu("999-999-999");
        klub3.setTrener(trener3);
        klub3.setSponsorzy(Set.of(sponsor1));
        klub3.setZawodnicy(Set.of(zawodnik));
        klubRepository.save(klub1);
        klubRepository.save(klub2);
        klubRepository.save(klub3);


        mecz1.setKlub(klub1);
        mecz2.setKlub(klub2);
        mecz3.setKlub(klub3);
        zawodnik.setKlub(klub1);
        zawodnik3.setKlub(klub1);
        zawodnik2.setKlub(klub2);
        sponsor1.setKluby(Set.of(klub1,klub2,klub3));
        sponsor2.setKluby(Set.of(klub2,klub3));
        sponsor3.setKluby(Set.of(klub2));
        sponsor4.setKluby(Set.of(klub1,klub3));

        sponsorPrywatnyRepository.save(sponsor1);
        sponsorPrywatnyRepository.save(sponsor2);
        sponsorPrywatnyRepository.save(sponsor3);
        sponsorPrywatnyRepository.save(sponsor4);

        zawodnikRepository.save(zawodnik);
        zawodnikRepository.save(zawodnik2);
        zawodnikRepository.save(zawodnik3);
        meczRepository.save(mecz1);
        meczRepository.save(mecz2);
        meczRepository.save(mecz3);
    }
}
