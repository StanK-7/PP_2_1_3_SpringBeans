package app.model;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog extends Animal {
    public String toString() {
        return "I am a dog";
    }
}
