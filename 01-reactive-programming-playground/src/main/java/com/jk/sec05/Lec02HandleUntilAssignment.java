package com.jk.sec05;

import com.jk.common.Util;
import reactor.core.publisher.Flux;

public class Lec02HandleUntilAssignment {
    public static void main(String[] args) {
        Flux.<String>generate(synchronousSink -> synchronousSink.next(Util.faker().country().name()))
                .handle((tem,sink)->{
                    sink.next(tem);
                    if(tem.equalsIgnoreCase("canada")){
                        sink.complete();
                    }
                }).subscribe(Util.subscriber());
    }
}
