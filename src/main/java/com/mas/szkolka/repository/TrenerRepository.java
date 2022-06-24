package com.mas.szkolka.repository;

import com.mas.szkolka.model.Trener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrenerRepository extends JpaRepository<Trener,Long> {
}
