package model;

public class Artwork {
    private String title;
    private String artist;
    private String location;
    private String AwType;
    private int releaseYear;

    public Artwork(String title, String artist, String location, String AwType, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.location = location;
        this.AwType = AwType;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getAwType() {
        return AwType;
    }
    
    public void setAwType(String awType) {
        AwType = awType;
    }
    
    public int getReleaseYear() {
        return releaseYear;
    }
    
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "\nTitle: " + title + "\nArtist: " + artist + "\nLocation: " + location +
                "\nArtwork Type: " + AwType + "\nYear of release: " + releaseYear;
    }
}