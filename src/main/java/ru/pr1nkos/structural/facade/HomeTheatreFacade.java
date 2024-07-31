package ru.pr1nkos.structural.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HomeTheatreFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Lights lights;

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting down...");
        lights.dim(100);
        projector.off();
        dvdPlayer.off();
    }
}
