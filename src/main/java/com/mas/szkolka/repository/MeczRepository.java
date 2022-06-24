package com.mas.szkolka.repository;

import com.mas.szkolka.model.Mecz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeczRepository extends JpaRepository<Mecz,Long> {
}
