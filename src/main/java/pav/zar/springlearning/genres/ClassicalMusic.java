package pav.zar.springlearning.genres;


import pav.zar.springlearning.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Do my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Do my destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}
