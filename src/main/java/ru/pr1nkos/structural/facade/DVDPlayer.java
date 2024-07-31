package ru.pr1nkos.structural.facade;

public class DVDPlayer {

    public void on(){
        System.out.println("DVDPlayer on");
    }

    public void off(){
        System.out.println("DVDPlayer off");
    }

    public void play(String fileName) {
        System.out.println("Playing " + fileName);
    }

}
