package com.conygre.training.tradesimulator.model;

public enum TradeInstrument {
	BOND("BOND"),
	FUTURE("FUTURE"),
	CASH("CASH"),
	SWAP("SWAP"),
	STOCK("STOCK"),
	ETF("ETF");
	private String instrument;
	
	public String getInstrument() {
		return this.instrument;
	}
	
	private TradeInstrument(String instrument) {
		this.instrument = instrument;
	}
}
