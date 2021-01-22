package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.api.CharacterBean;
import com.example.demo.api.SwApi;

@Configuration
@EnableTask
public class TaskConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(SwApi swApi) {
        return args -> {
        	int num = args.length > 0 ? Integer.parseInt(args[0]) : 1;
        	CharacterBean bean = swApi.getCharacter(num);
            System.out.println("Fetched character: " + bean.getName());
        };
    }
}