package com.jk.sec03;

import com.jk.common.Util;
import reactor.core.publisher.Flux;

import java.util.List;

public class Lec03FluxFromIterableOrArray {

    public static void main(String[] args) {
        Flux.fromIterable(List.of(1,2,34,3))
                .subscribe(Util.subscriber());
        Integer[] integers = {1,2,3,4};
        Flux.fromArray(integers).subscribe(Util.subscriber());
    }
}
