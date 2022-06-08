package com.example.springboot;

import com.azure.core.util.logging.ClientLogger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	private final ClientLogger logger = new ClientLogger(HelloController.class);
	@RequestMapping("/{name}")
	public String index(@PathVariable(value = "name") String name) throws Exception {
		System.out.println( "Hello, user!" );
		logger.info("We've just greeted the user!");
		logger.warning("We've just greeted the user!");
		logger.verbose("We've just greeted the user!");
		logger.error("We've just greeted the user!");
		if ("yes".equalsIgnoreCase(name)) {
			logger.logThrowableAsError(new Exception("unexpected exceptions"));
		}
//		if ("yes".equalsIgnoreCase(name)) {
//			throw new Exception("unexpected exceptions");
//		}
		return "Greetings from Spring Boot!";
	}

}
