package com.time.tracker.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure( AuthenticationManagerBuilder auth) {

    }

    @Override
    protected void configure( HttpSecurity httpSecurity ) throws Exception {
        httpSecurity.authorizeRequests()
            .antMatchers( "/edit/**" , "/add/**" , "/delete" )
                .hasRole( "ADMIN" )
            .antMatchers( "/" )
                .hasAnyRole( "USER" , "ADMIN" )
                .and()
                    .formLogin()
                    .loginPage("/login")
                .and()
                    .exceptionHandling().accessDeniedPage("/errors/403");
            ;
    }
}
