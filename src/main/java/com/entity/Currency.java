package com.entity;

public class Currency {
    private String currencyCode;
    private Tradablity tradability;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Tradablity getTradability() {
        return tradability;
    }

    public void setTradability(Tradablity tradability) {
        this.tradability = tradability;
    }
}
