package com.examly.springapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;
import java.util.List;


@RestController
@SpringBootApplication
public class SpringappApplication {

	@PersistenceUnit
    private EntityManagerFactory emf;
	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);

	}

	



}
