package com.jk.sec03;

import com.jk.common.Util;
import com.jk.sec01.subscriber.SubscriberImpl;
import com.jk.sec03.helper.NameGenerator;

public class Lec07FluxVsList {

    public static void main(String[] args) {
//        var list = NameGenerator.generateNameList(10);
//        System.out.println(list);
        var subscriber = new SubscriberImpl();
        NameGenerator.generateNameFlux(10)
                .subscribe(subscriber);

        subscriber.getSubscription().request(3);
        subscriber.getSubscription().cancel();    }
}
