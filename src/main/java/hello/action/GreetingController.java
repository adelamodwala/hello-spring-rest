package hello.action;

import hello.entity.IEmployee;
import hello.entity.IGreeting;
import hello.service.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements IGreetingController {
    
    protected IGreetingService greeting;
	
	protected String defaultBlurb; 
	
    public void setGreeting(IGreetingService greeting) {
    	this.greeting = greeting;
    }
    
    public void setDefaultBlurb(String blurb) {
    	this.defaultBlurb = blurb;
    }
    
    public String getDefaultBlurb() {
    	return this.defaultBlurb;
    }
    
    public IGreetingService getGreetingService() {
    	return this.greeting;
    }
    

    @RequestMapping("/greeting")
    public IGreeting greeting(@RequestParam(value="name", defaultValue="Boyo!") String name) {
    	String currentGreeting = this.getGreetingService().getGreeting().getGreeting();
    	this.getGreetingService().getGreeting().setGreeting(String.format("%s %s", currentGreeting, name));
    	return this.getGreetingService().getGreeting();
    }
    
    @RequestMapping("/employee")
    public IEmployee getEmployee(@RequestParam(value="id", defaultValue="1") int id) {
    	return this.getGreetingService().getEmployee(id);
    }
}
