package com.infosys.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Trade;
import com.infosys.repository.TradeRepository;

@Service
public class TradeService {
    @Autowired
    private TradeRepository tradeRepository;
    
    public List<Trade> getAll(){
    	return tradeRepository.findAll();
    }
}
