package io.vijay.stackoverflow.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {

    // DI
    @Autowired
    private Environment env;

    // get tokenSecret from properties file in production
    public String getTokenSecret() {
        return env.getProperty("tokenSecret");
    }
}

