package com.bala.GamePool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Balaji Achanta
 */
@SpringBootApplication
public class GamePoolApplication{

  private static Logger log = LoggerFactory.getLogger(GamePoolApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(GamePoolApplication.class, args);
		log.info("GamePool Application Started");
	}

	
}
