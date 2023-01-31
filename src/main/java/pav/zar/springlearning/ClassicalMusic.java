package pav.zar.springlearning;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic(){}

    @Override
    public String getSong() {
        return "Hungraian Rhapsody";
    }
}
