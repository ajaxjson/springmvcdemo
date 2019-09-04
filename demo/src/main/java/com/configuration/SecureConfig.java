package com.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableAutoConfiguration
public class SecureConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated()
                .and().csrf()
                .disable()
                .httpBasic();
    }
    
}