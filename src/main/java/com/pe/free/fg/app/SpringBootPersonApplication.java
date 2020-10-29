package com.pe.free.fg.app;

import com.pe.free.fg.app.model.Person;
import com.pe.free.fg.app.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPersonApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootPersonApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPersonApplication.class, args);
	}

	@Autowired
	private PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {

		logger.info("Saving persons");

		personRepository.save(new Person("Fernando", 25L));
		personRepository.save(new Person("Mark", 27L));
		personRepository.save(new Person("Steven", 29L));

	}
}
