package com.jk.sec05;

import com.jk.common.Util;
import reactor.core.publisher.Flux;

public class Lec08SwitchIfEmpty {
    public static void main(String[] args) {

        /*
            postgres + redis
         */
        Flux.range(0,10)
                .filter(i->i>11)
                .switchIfEmpty(fallback())
                .subscribe(Util.subscriber());
    }

    private static Flux<Integer> fallback(){
        return Flux.range(100, 3);
    }
}
