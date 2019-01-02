package com.controller;

import com.entity.Currency;
import com.entity.Tradablity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @RequestMapping(value = "/hello/{currencyCod}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Currency hello(@PathVariable String currencyCod){
        Currency currency = new Currency();
        Tradablity tradablity = new Tradablity();
        tradablity.setBuyable(true);
        tradablity.setSellable(false);
        currency.setCurrencyCode(currencyCod);
        currency.setTradability(tradablity);
        return currency;
    }
}
