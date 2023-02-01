package pav.zar.springlearning.genres;

import org.springframework.stereotype.Component;
import pav.zar.springlearning.Music;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
