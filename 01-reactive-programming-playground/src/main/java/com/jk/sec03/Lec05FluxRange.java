package com.jk.sec03;

import com.jk.common.Util;
import reactor.core.publisher.Flux;

public class Lec05FluxRange {

    public static void main(String[] args) {
        Flux.range(1,10)
                .subscribe(Util.subscriber());

        //   generate 10 random first names
        Flux.range(1,10)
                .map(x->Util.faker().name().firstName())
                .subscribe(Util.subscriber());

    }
}
