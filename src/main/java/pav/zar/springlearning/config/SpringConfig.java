package pav.zar.springlearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pav.zar.springlearning.*;
import pav.zar.springlearning.genres.ClassicalMusic;
import pav.zar.springlearning.genres.HipHopMusic;
import pav.zar.springlearning.genres.RockMusic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public HipHopMusic hipHopMusic() {
        return new HipHopMusic();
    }

    @Bean
    public List<Music> musicGenres() {
        return new ArrayList<>(Arrays.asList(hipHopMusic(), classicalMusic(), rockMusic()));
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicGenres());
    }

}
