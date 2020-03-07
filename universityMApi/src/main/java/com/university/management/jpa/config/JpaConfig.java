package com.university.management.jpa.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages= {"com.university.management.repository"}) // since Spring Data JPA 1.3
//@EnableJpaAuditing(auditorAwareRef="auditorProvider", dateTimeProviderRef="auditingDateTimeProvider") 
@EntityScan(basePackages= {"com.university.management.domain.entity"})
public class JpaConfig {

	/* @Bean(name = "auditingDateTimeProvider")
	   *//**
	    * For auditing using ZonedDateTime
	    * 
	    * @return
	    *//*
	   public DateTimeProvider dateTimeProvider() {
	      return () -> Optional.of(ZonedDateTime.now());
	   }*/
}
