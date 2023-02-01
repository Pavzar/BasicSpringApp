package pav.zar.springlearning;

import java.util.List;
import java.util.Random;


public class MusicPlayer {

    private List<Music> musicGenres;

    public MusicPlayer(List<Music> musicGenres) {
        this.musicGenres = musicGenres;
    }

    public void playMusic() {
        Random r = new Random();
        int random = r.nextInt(3);
        System.out.println(musicGenres.get(random).getSong());
    }
}
