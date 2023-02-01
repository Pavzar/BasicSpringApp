package pav.zar.springlearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pav.zar.springlearning.config.SpringConfig;

public class TestSpring {
    public static void main(String[] args) {
        //Usage of SpringConfig
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
