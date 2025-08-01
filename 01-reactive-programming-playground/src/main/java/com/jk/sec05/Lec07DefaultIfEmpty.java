package com.jk.sec05;

import com.jk.common.Util;
import reactor.core.publisher.Flux;

/*
    Similar to error handling.
    Handling empty!
 */
public class Lec07DefaultIfEmpty {
    public static void main(String[] args) {
        Flux.range(0, 10)
                .filter(i -> i > 11)
                .defaultIfEmpty(40)
                .subscribe(Util.subscriber());
    }
}
