package com.jk.sec02;

import com.jk.common.Util;
import com.jk.sec02.client.ExternalServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
    To demo non-blocking IO
    Ensure that the external service is up and running!
 */
public class Lec11NonBlockingIO {

    private static final Logger log = LoggerFactory.getLogger(Lec11NonBlockingIO.class);

    public static void main(String[] args) {

        var client = new ExternalServiceClient();
        for (int i = 1; i < 5; i++) {
            client.getProductName(1)
                    .subscribe(Util.subscriber());
        }
        Util.sleepSeconds(2);
    }

}
