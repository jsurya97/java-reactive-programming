package com.jk.sec05;

import com.jk.common.Util;
import reactor.core.publisher.Flux;

public class Lec01Handle {
    public static void main(String[] args) {
        Flux.range(1,10)
                .filter(z->z!=7)
                .handle((item,sink)->{
                    switch (item){
                        case 1->sink.next(-2);
                        case 4->{}
                        case 7-> sink.error(new RuntimeException());
                        default -> sink.next(item);
                    }
                }).subscribe(Util.subscriber());
    }
}
