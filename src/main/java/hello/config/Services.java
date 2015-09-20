package hello.config;

import hello.service.*;

import org.springframework.context.annotation.*;

@Configuration
public class Services {

	@Bean
	public IGreeting setGreetingService() {
		return new Greeting(13, "Boy19");
	}
	
}
