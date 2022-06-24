package com.mas.szkolka.repository;

import com.mas.szkolka.model.SponsorPrywatny;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorPrywatnyRepository extends JpaRepository<SponsorPrywatny,Long> {
}
