package com.rest.eskaysoftAPI;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@SpringBootApplication
@EnableJpaAuditing
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.rest.eskaysoftAPI.service", "com.rest.eskaysoftAPI.service.impl", "com.rest.com.rest.eskaysoftAPI.resource"})
@EnableJpaRepositories("com.rest.eskaysoftAPI.dao")
@EntityScan(basePackages = "com.rest.eskaysoftAPI.entity")
public class App extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(App.class);
	}

	@Bean
	JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		return jdbcTemplate;
	}

	@Bean
	NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) {
		NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

		return namedParameterJdbcTemplate;
	}
}