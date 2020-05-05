package by.jrr.service;

public class GreetingService {
    public String greet(String name){
        if (name == null || name.isEmpty() || name.trim().isEmpty()) {
            throw new IllegalArgumentException("name shouldn't be null");
        }
        return "Hello " + name;
    }
}
