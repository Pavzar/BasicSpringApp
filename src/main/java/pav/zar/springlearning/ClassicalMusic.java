package pav.zar.springlearning;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
//@Scope("singleton")
//@Scope("prototype")
public class  ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit(){
        System.out.println("Do my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my destroy");
    }


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
