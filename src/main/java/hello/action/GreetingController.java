package hello.action;

import hello.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
	@Autowired
    protected IGreeting greeting;
    
    public void setGreeting(IGreeting greeting) {
    	this.greeting = greeting;
    }
    
    public IGreeting getGreeting() {
    	return this.greeting;
    }

    @RequestMapping("/greeting")
    public IGreeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	this.getGreeting().setContent(String.format("Hiya %s!", name));
    	return this.getGreeting();
    	
    }
}
