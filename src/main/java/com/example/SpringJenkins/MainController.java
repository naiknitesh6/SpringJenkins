package com.example.SpringJenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
public static Logger logger=LoggerFactory.getLogger(MainController.class);
@GetMapping("/home")
public String home()
{logger.info("Welcome to Spring Jenkins project");
logger.info("Welcome to Spring Jenkins project four"
		);
	return "Welcome to Spring Jenkins project";
}
@GetMapping("/hom2e")
public String home2()
{logger.info("Welcome to Spring Jenkins project2");
logger.info("Welcome to Spring Jenkins project second2"
		);
	return "Welcome to Spring Jenkins project";
}
}
