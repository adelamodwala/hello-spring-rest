package hello.entity;

public class Greeting implements IGreeting {
    
    protected String greeting;
    
    public void setGreeting(String greeting) {
    	this.greeting = greeting;
    }
    
    public String getGreeting() {
        return this.greeting;
    }
}
