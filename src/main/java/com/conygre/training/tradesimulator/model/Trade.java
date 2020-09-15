package com.conygre.training.tradesimulator.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="trade")
public class Trade {

	@Id
    private long id;
    private String username;
    private Date created = new Date(System.currentTimeMillis());
    private TradeState state = TradeState.CREATED;
    private TradeType type;
    private TradeInstrument instrument;
    private String ticker;
    private int quantity;
    private double price;


    public String getUsername() {
    	return username;
    }
    
    public void setUsername(String username) {
    	this.username = username;
    }
    
    public TradeInstrument getInstrument() {
    	return instrument;
    }
    
    public void setInstrument(TradeInstrument instrument) {
    	this.instrument = instrument;
    }
    
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public TradeState getState() {
        return state;
    }

    public void setState(TradeState state) {
        this.state = state;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TradeType getType() {
        return type;
    }

    public void setType(TradeType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
