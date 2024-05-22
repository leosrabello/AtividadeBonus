package model;
public class Sculpture extends Artwork {

    private String resource;

    public Sculpture(String title, String artist, String location, String awType, int releaseYear, String resource) {
        super(title, artist, location, "Sculpture", releaseYear);
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}