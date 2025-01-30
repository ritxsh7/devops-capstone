package com.infosys.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.domain.Trade;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
	@Query("SELECT t FROM Trade t WHERE t.status = 'OPEN'")
    List<Trade> findActiveTrades();

    @Query("SELECT t FROM Trade t WHERE t.settlementDate BETWEEN :startDate AND :endDate")
    List<Trade> findTradesMaturingWithinPeriod(LocalDate startDate, LocalDate endDate);
}
