package com.jk.sec05;

import com.jk.common.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class Lec04Delay {
    public static void main(String[] args) {
        Flux.range(0,10)
                .log()
                .delayElements(Duration.ofSeconds(1))
                .subscribe(Util.subscriber("subscriber"));

        Util.sleepSeconds(12);
    }
}
