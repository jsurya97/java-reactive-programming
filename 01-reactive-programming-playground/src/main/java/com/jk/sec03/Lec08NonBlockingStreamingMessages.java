package com.jk.sec03;

import com.jk.common.Util;
import com.jk.sec03.client.ExternalServiceClient;

/*
    To demo non-blocking IO with streaming messages
    Ensure that the external service is up and running!
 */
public class Lec08NonBlockingStreamingMessages {

    public static void main(String[] args) {
        var client = new ExternalServiceClient();
        client.getProductNames().subscribe(Util.subscriber("sub1"));
        client.getProductNames().subscribe(Util.subscriber("sub2"));

        Util.sleepSeconds(6);
    }
}
