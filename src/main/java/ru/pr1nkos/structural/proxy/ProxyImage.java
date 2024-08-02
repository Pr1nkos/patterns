package ru.pr1nkos.structural.proxy;

/**
 * The type Proxy image.
 */
public class ProxyImage implements Image{
    private RealImage image;
    private String filename;

    /**
     * Instantiates a new Proxy image.
     *
     * @param filename the filename
     */
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
