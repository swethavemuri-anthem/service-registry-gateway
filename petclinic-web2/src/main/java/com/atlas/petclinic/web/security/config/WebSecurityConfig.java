/**
 * 
 */
package com.atlas.petclinic.web.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author AC63348
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	JWTWebAuthenticationFilter authFilter;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
	// uncomment to enable security and ensure that auth token is passed to maintain session 
		http.authorizeRequests().antMatchers("/login","/petclinic/**").permitAll()
		//	.anyRequest().authenticated()
			.and()
		//	.addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class)
			.csrf().disable();
	}
	
	@Override
	@Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(clientUserDetailsService());
    }
    
    @Bean
	public ClientUserDetailsServiceImpl clientUserDetailsService() {
    	ClientUserDetailsServiceImpl clientUserDetailsService = new ClientUserDetailsServiceImpl();
		return clientUserDetailsService;
	}
}
