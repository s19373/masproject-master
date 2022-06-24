package com.mas.szkolka.dataloader;

import com.mas.szkolka.model.Trener;
import com.mas.szkolka.repository.TrenerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DatabaseLoader implements CommandLineRunner {

    private final TrenerRepository trenerRepository;

    @Override
    public void run(String... args) throws Exception {

        Trener trener1 = new Trener();
        trener1.setImie("Jan");
        trener1.setNazwisko("Kowalski");
        trener1.setEmail("jankow@gmail.com");
        trener1.setNrKontaktowy("539-602-202");
        trener1.setDataUrodzenia(LocalDate.of(1996,10,22));
        trener1.setDataZatrudnienia(LocalDate.of(2022,01,10));
        trener1.setLiczbaGodzin(50);
        trener1.setStawkaZaGodzine(150);

        trenerRepository.save(trener1);



    }
}
