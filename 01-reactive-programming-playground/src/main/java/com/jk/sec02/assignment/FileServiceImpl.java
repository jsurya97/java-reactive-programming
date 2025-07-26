package com.jk.sec02.assignment;

import com.jk.sec02.Lec01LazyStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileServiceImpl {

    private static final Logger log = LoggerFactory.getLogger(Lec01LazyStream.class);

    private static  final Path PATH = Path.of("src/main/resources/sec02");
    public Mono<String> read(String fileName){
        return  Mono.fromCallable(()-> Files.readString(PATH.resolve(fileName)));
    }

    public Mono<Void> write(String fileName, String content){
        return Mono.fromRunnable(()->this.writeFile(fileName, content));
    }

    public Mono<Void> delete(String fileName){
        return Mono.fromRunnable(()->this.deleteFile(fileName));
    }

    private void writeFile(String fileName, String content){
        try{
            Files.writeString(PATH.resolve(fileName),content);
            log.info("file.txt written");
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    private void deleteFile(String fileName){
        try{
            Files.delete(PATH.resolve(fileName));
            log.info("file.txt written");
        }catch (Exception e){
            throw new RuntimeException("");
        }
    }
}
