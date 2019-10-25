package com.tr.bluemoon.springdatajdbc.services;

import javax.sql.DataSource;

import com.tr.bluemoon.springdatajdbc.services.client.dao.ClientConverter;
import com.tr.bluemoon.springdatajdbc.services.client.dao.ClientDao;
import com.tr.bluemoon.springdatajdbc.services.client.dao.ClientRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJdbcRepositories(basePackages = "com.tr.bluemoon.springdatajdbc")
public class DaoModule extends AbstractJdbcConfiguration {

	@Bean
	public NamedParameterJdbcOperations operations() {
		return new NamedParameterJdbcTemplate(dataSource());
	}
	
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
	}
	
	@Bean
	public DataSource dataSource() {
        DriverManagerDataSource driver = new DriverManagerDataSource();
        driver.setDriverClassName("org.postgresql.Driver");
        driver.setUrl("jdbc:postgresql://localhost:5432/employee");
        driver.setUsername("postgres");
        driver.setPassword("password");
        return driver;
	}

	@Bean
	public ClientConverter clientConverter() {
		return new ClientConverter();
	}
	
	@Bean
	public ClientDao clientDAO(ClientRepository clientRepository, ClientConverter clientConverter) {
		return new ClientDao(clientRepository, clientConverter);
	}

}
