package com.tcs.springcoreexample.basic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Config {

	// UserDetailsService is an interface which holds User's data
	// internally Spring security uses UserDetailsService object to validate
	// username
	// password
	/*
	 * @Bean protected UserDetailsService userDetailsService() { List<UserDetails>
	 * users = new ArrayList<>();
	 * 
	 * users.add(User.withDefaultPasswordEncoder().username("abc").
	 * password("xyz").roles("user").build());
	 * users.add(User.withDefaultPasswordEncoder().username("abc2").
	 * password("xyz2").roles("user").build());
	 * users.add(User.withDefaultPasswordEncoder().username("xyz").
	 * password("xyz").roles("admin").build()); return new
	 * InMemoryUserDetailsManager(users); }
	 */

	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public DaoAuthenticationProvider authicate() {
		DaoAuthenticationProvider dp = new DaoAuthenticationProvider();
		dp.setUserDetailsService(userDetailsService);
		dp.setPasswordEncoder(new BCryptPasswordEncoder());
		return dp;
	}

	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests().anyRequest().authenticated().and().oauth2Login().defaultSuccessUrl("/userdetails");
        return http.build();
    }
}
