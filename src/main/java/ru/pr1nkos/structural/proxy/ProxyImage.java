package ru.pr1nkos.structural.proxy;

public class ProxyImage implements Image{
    private RealImage image;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.display();
    }
}
