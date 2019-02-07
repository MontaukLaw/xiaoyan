package com.wulala.tokenservice.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    //所有的request都需要认证
    @Override
    public void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().anyRequest().authenticated();
        //http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/**").hasRole("admin").anyRequest().authenticated();
//        http
//                .authorizeRequests()
//                .antMatchers(HttpMethod.DELETE, "/v1/organizations/**")
//                .hasRole("ADMIN")
//                .anyRequest()
//                .authenticated();
    }
}
