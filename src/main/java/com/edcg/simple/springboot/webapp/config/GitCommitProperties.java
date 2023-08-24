package com.edcg.simple.springboot.webapp.config;

import lombok.Data; 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("classpath:git.properties")
public class GitCommitProperties {
    @Value("${git.commit.id.abbrev:na}")
    private String abbrev;

    @Value("${git.commit.id.full:na}")
    private String full;

    @Value("${git.commit.message.short:na}")
    private String messageShort;

    @Value("${git.commit.time:na}")
    private String time;
}