package ru.pr1nkos.structural.facade;

/**
 * The type Dvd player.
 */
public class DVDPlayer {

    /**
     * On.
     */
    public void on(){
        System.out.println("DVDPlayer on");
    }

    /**
     * Off.
     */
    public void off(){
        System.out.println("DVDPlayer off");
    }

    /**
     * Play.
     *
     * @param fileName the file name
     */
    public void play(String fileName) {
        System.out.println("Playing " + fileName);
    }

}
