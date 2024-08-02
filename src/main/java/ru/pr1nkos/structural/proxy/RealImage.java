package ru.pr1nkos.structural.proxy;

/**
 * The type Real image.
 */
public class RealImage implements Image{
    private String filename;

    /**
     * Instantiates a new Real image.
     *
     * @param filename the filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}
