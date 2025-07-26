package com.jk.sec03;

import com.jk.common.Util;
import reactor.core.publisher.Flux;

public class Lec01FluxJust {

    public static void main(String[] args) {
        Flux.just(1,2,3,"d").subscribe(Util.subscriber());
    }
}
