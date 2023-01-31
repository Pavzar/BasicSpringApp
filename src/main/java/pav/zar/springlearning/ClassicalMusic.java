package pav.zar.springlearning;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalMusicSongs = new ArrayList<>();

    //init block
    {
        classicalMusicSongs.add("Hungarian Rhapsody");
        classicalMusicSongs.add("The Four Seasons");
        classicalMusicSongs.add("Für Elise");
    }

    @Override
    public List<String> getSongs() {
        return classicalMusicSongs;
    }
}
