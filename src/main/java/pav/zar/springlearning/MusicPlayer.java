package pav.zar.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int result = random.nextInt(3);

        if(genre == MusicGenre.CLASSICAL){
            System.out.println(classicalMusic.getSongs().get(result));
        } else {
            System.out.println(rockMusic.getSongs().get(result));
        }
    }
}
