package com.jk.sec03.client;

import com.jk.common.AbstractHttpClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ExternalServiceClient extends AbstractHttpClient {

    public Flux<String> getProductNames() {
        return this.httpClient.get().uri("/demo02/name/stream")
                .responseContent()
                .asString();
    }

    public Flux<Integer> getPriceChange() {
        return this.httpClient.get().uri("/demo02/stock/stream")
                .responseContent()
                .asString()
                .map(Integer::parseInt);
    }

}
