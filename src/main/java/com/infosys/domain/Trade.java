package com.infosys.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trades")
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tradeId;
    private Long userId;
    private Long bookId;
    private String currency;
    private String status;
    private Integer quantity;
    private Double unitPrice;
	private String buySellIndicator;
    private LocalDate tradeDate;
    private LocalDate settlementDate;
   
    
   
    public Long getTradeId() {
		return tradeId;
	}


	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public Long getBookId() {
		return bookId;
	}


	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getBuySellIndicator() {
		return buySellIndicator;
	}


	public void setBuySellIndicator(String buySellIndicator) {
		this.buySellIndicator = buySellIndicator;
	}


	public LocalDate getTradeDate() {
		return tradeDate;
	}


	public void setTradeDate(LocalDate tradeDate) {
		this.tradeDate = tradeDate;
	}


	public LocalDate getSettlementDate() {
		return settlementDate;
	}


	public void setSettlementDate(LocalDate settlementDate) {
		this.settlementDate = settlementDate;
	}


	public Trade(){
    	
    }
}