package pav.zar.springlearning;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String> rockMusicSongs = new ArrayList<>();

    //init block
    {
        rockMusicSongs.add("Wind Cries Mary");
        rockMusicSongs.add("Distortion Sleep");
        rockMusicSongs.add("Voodoo child");
    }

    @Override
    public List<String> getSongs() {
        return rockMusicSongs;
    }
}
