package model;
public class Painting extends Artwork {
    
    private String procedure;

    public Painting(String title, String artist, String location, int releaseYear, String procedure) {
        super(title, artist, location, "Painting", releaseYear);
        this.procedure = procedure;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }
}
