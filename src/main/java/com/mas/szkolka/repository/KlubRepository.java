package com.mas.szkolka.repository;

import com.mas.szkolka.model.Klub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlubRepository extends JpaRepository<Klub,Long> {
}
