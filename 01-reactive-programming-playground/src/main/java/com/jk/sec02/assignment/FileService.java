package com.jk.sec02.assignment;

import reactor.core.publisher.Mono;


public interface FileService {

    public Mono<String> read(String fileName);

    public Mono<Void> write(String fileName);

    public Mono<Void> delete(String fileName);


}
