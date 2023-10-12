package com.javaegitimleri.petclinic;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Order(value = 1)
@Configuration
public class RestSecurityConfig extends AbstractSecurityConfiguration {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http); //securityconfigteki permitall tanımını eziyor.
        http.antMatcher("/rest/**"); //bu security config sadece /rest prefixi ile başlayan request URLlerinde devreye girecek.
        http.authorizeRequests().antMatchers("/rest/**").access("hasRole('EDITOR')");
        http.csrf().disable();
        http.httpBasic();
    }
}
