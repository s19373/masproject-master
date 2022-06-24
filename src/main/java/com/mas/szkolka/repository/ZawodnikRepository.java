package com.mas.szkolka.repository;

import com.mas.szkolka.model.Zawodnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZawodnikRepository extends JpaRepository<Zawodnik,Long> {
}
