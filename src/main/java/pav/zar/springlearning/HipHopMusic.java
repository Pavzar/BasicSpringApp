package pav.zar.springlearning;

import org.springframework.stereotype.Component;


public class HipHopMusic implements Music{

    @Override
    public String getSong() {
        return "All Eyez On Me";
    }
}
