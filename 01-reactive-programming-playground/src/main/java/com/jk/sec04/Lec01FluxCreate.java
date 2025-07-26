package com.jk.sec04;

import com.jk.common.Util;
import reactor.core.publisher.Flux;

public class Lec01FluxCreate {
    public static void main(String[] args) {
        Flux.create(fluxSink -> {
            String country;
            do{
                country= Util.faker().country().name();
                fluxSink.next(country);
            }while (country.equalsIgnoreCase("canada"));
                fluxSink.complete();
        });
    }
}
