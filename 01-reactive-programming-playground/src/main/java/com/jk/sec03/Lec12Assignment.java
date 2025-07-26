package com.jk.sec03;

import com.jk.common.Util;
import com.jk.sec03.assignment.StockPriceObserver;
import com.jk.sec03.client.ExternalServiceClient;

public class Lec12Assignment {
    public static void main(String[] args) {
        var client = new ExternalServiceClient();
       var subscriber = new StockPriceObserver();
       client.getPriceChange().subscribe(subscriber);
        Util.sleepSeconds(20);
    }
}
