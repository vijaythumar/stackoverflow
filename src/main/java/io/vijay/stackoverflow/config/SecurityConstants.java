package io.ridham.project1.config;

import io.ridham.project1.SpringApplicationContext;

public class SecurityConstants {
    public static final int EXPIRATION_TIME = 3600*1000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";

    public static String getTokenSecret()
    {
        AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");
        return appProperties.getTokenSecret();
    }
}
