package com.example.ZuulService.config;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.ZuulService.security.JwtTokenAuthenticationFilter;

//@EnableWebSecurity
//public class SecurityTokenConfig extends WebSecurityConfiguration {
//
//    @Autowired
//    private JwtConfig jwtConfig;
//
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and().exceptionHandling().authenticationEntryPoint((req, rsp, e)-> rsp.sendError(HttpServletResponse.SC_UNAUTHORIZED))
//                .and().addFilterAfter(new JwtTokenAuthenticationFilter(jwtConfig), UsernamePasswordAuthenticationFilter.class)
//                .authorizeRequests()
//                	.antMatchers(org.springframework.http.HttpMethod.POST, jwtConfig.getUri()).permitAll()
//                	.antMatchers("/gallery"+"/admin/**").hasRole("ADMIN")
//                	.anyRequest().authenticated();
//    }
//
//    @Bean
//    public JwtConfig jwtConfig() {
//    	return new JwtConfig();
//    }
//}