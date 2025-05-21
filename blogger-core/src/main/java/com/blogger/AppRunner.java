package com.blogger;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class AppRunner implements CommandLineRunner {
    private final BloggerRepository bloggerRepository;

    @Override
    public void run(String... args) throws Exception {
        Blogger blogger = Blogger.builder()
                .post("Blog 1")
                .build();
        bloggerRepository.save(blogger);

        Blogger blogger2 = Blogger.builder()
                .post("Blog 2")
                .build();
        bloggerRepository.save(blogger2);

        Blogger blogger3 = Blogger.builder()
                .post("Blog 3")
                .build();
        bloggerRepository.save(blogger3);

        log.info("List of bloggers: \n{}", bloggerRepository.findAll());
    }
}
