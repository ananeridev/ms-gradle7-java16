package com.anabneri.gradlejava16test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.anabneri.gradlejava16test.ProductRepository")
public class GradleJava16TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleJava16TestApplication.class, args);
	}

}
