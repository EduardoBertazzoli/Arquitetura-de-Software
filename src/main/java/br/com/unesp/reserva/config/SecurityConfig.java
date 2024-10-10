/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.reserva.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
@Configuration
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws 
            Exception {
        
        http.authorizeHttpRequests(authorize -> 
                authorize
                        .requestMatchers("/", "/login**").permitAll()
                        .anyRequest()
                        .authenticated())                
                .oauth2Login(oauth2 -> 
                oauth2
                    .loginPage("/oauth2/authorization/google")
                    .defaultSuccessUrl("/", true)
            );
        
        return http.build();
    }

}
