package com.infosys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.domain.Trade;
import com.infosys.service.TradeService;

@RestController
@RequestMapping("/trades")
public class TradeController {
    @Autowired
    private TradeService tradeService;
    
    @GetMapping()
    public List<Trade> getAll(){
    	return tradeService.getAll();
    }

    @GetMapping("/active")
    public List<Trade> getActiveTrades() {
        return tradeService.getActiveTrades();
    }

    @GetMapping("/5daywindow")
    public List<Trade> getMaturingTrades() {
        return tradeService.getMaturingTrades();
    }
}
