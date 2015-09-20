package hello.service;

public class Greeting implements IGreeting {

    protected long id;
    protected String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public void setContent(String content) {
    	this.content = content;
    }
    
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
