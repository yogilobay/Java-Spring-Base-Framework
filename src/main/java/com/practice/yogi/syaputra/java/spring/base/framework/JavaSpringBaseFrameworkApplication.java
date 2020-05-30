package com.practice.yogi.syaputra.java.spring.base.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
		scanBasePackages = {
				"com.practice.yogi.syaputra.java.spring.base.framework",
		}
)

@ComponentScan(
		basePackages = {
				"com.practice.yogi.syaputra.java.spring.base.framework.service",
				"com.practice.yogi.syaputra.java.spring.base.framework.repository",
				"com.practice.yogi.syaputra.java.spring.base.framework.entity",
				"com.practice.yogi.syaputra.java.spring.base.framework.Utils",
				"com.practice.yogi.syaputra.java.spring.base.framework.json",

		}
)

@EnableJpaRepositories(
		basePackages = {
				"com.practice.yogi.syaputra.java.spring.base.framework.repository",
		}
)

@EntityScan(
		basePackages = {
				"com.practice.yogi.syaputra.java.spring.base.framework",
		}
)
public class JavaSpringBaseFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBaseFrameworkApplication.class, args);
	}

}
