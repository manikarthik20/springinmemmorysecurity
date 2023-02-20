package com.example.basicauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/welcom").permitAll()
		.antMatchers("/home").authenticated()
		.antMatchers("/personal").hasAuthority("admin")
		.antMatchers("/orders").hasAuthority("user")
		.antMatchers("/orders").hasAuthority("user")
		.antMatchers("/wallet").hasAuthority("user")
		.antMatchers("/contactUs").permitAll()
		.antMatchers("/aboutUs").permitAll()
		.antMatchers("/orders").hasAuthority("user")
		.antMatchers("/mobiles").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.defaultSuccessUrl("/welcome",true)
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.and()
		.exceptionHandling()
		.accessDeniedPage("/denied");
	
	}
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("mani").password("{noop}mani@123").roles("user");
		auth.inMemoryAuthentication().withUser("karthik").password("{noop}karthik@123").roles("manager");
		auth.inMemoryAuthentication().withUser("chandankeri").password("{noop}chandankeri@123").roles("admin");
		auth.inMemoryAuthentication().withUser("chintu").password("{noop}chintu@123").roles("vendor");
	}

}
