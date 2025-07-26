package com.jk.sec03;

import com.jk.common.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;

/*
    To emit a message based on the given interval
 */
public class Lec09FluxInterval {
    public static void main(String[] args) {
        Flux.interval(Duration.ofMillis(500))
                .map(q->Util.faker().name().firstName())
                .subscribe(Util.subscriber());

        Util.sleepSeconds(5);
    }
}
