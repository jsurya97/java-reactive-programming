package com.jk.sec06;

import com.jk.common.Util;
import com.jk.sec04.helper.NameGenerator;
import reactor.core.publisher.Flux;

/*
    To fix the issue we faced in sec04/Lec02FluxCreateRefactor
 */
public class Lec05FluxCreateIssueFix {

    public static void main(String[] args) {
        var generator = new NameGenerator();
        var flux = Flux.create(generator).share();
        flux.subscribe(Util.subscriber("sub1"));
        flux.subscribe(Util.subscriber("sub2"));

        // somewhere else!
        for (int i = 0; i < 10; i++) {
            generator.generate();
        }

    }
}
