package com.projet.yamima.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;

import com.projet.yamima.configuration.filtres.CORSFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {

	@Autowired
	public CORSFilter corsFilter;

	@Bean
	public UserDetailsService users() {
		// The builder will ensure the passwords are encoded before saving in memory
		UserBuilder users = User.withDefaultPasswordEncoder();
		UserDetails user = users.username("user").password("password").roles("USER").build();
		UserDetails admin = users.username("admin").password("password").roles("USER", "ADMIN").build();
		return new InMemoryUserDetailsManager(user, admin);
	}

	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		http.addFilterBefore(corsFilter, ChannelProcessingFilter.class);
		return http.csrf(csrf -> csrf.disable()).authorizeRequests(auth -> {
			auth.requestMatchers("/").permitAll();
			auth.requestMatchers("/user").hasRole("User");
			auth.requestMatchers("/Admin").hasRole("Admin");
		}).httpBasic(Customizer.withDefaults()).build();
	}
}
