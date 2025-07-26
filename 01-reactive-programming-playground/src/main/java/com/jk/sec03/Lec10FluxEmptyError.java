package com.jk.sec03;

import com.jk.common.Util;
import reactor.core.publisher.Flux;

public class Lec10FluxEmptyError {
    public static void main(String[] args) {
        Flux.empty().subscribe(Util.subscriber());
        Flux.error(new RuntimeException("test")).subscribe(Util.subscriber());
    }
}
