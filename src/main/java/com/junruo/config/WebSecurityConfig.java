package com.junruo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author: JunRuo
 * @Date: 15:02 2022/7/21
 * @Description:
 * @Version v1.0
 */

@Configuration
@Order
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        //禁用csrf保护
        http.csrf().disable();

        http.authorizeRequests()
                .antMatchers("/love", "/love/**","/login.html","/myLogin","/doLogin").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().and().httpBasic();

    }
}