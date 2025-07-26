package com.jk.sec04;

import com.jk.common.Util;
import com.jk.sec04.helper.NameGenerator;
import reactor.core.publisher.Flux;

public class Lec02FluxCreateRefactor {

    public static void main(String[] args) {
        var generate =  new NameGenerator();
        var flex = Flux.create(generate);
        flex.subscribe(Util.subscriber());

        for (int i = 0; i < 10; i++) {
            generate.generate();
        }
    }
}
