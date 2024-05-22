package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataStructure {

    public static void saveArtworks(List<Artwork> works, String archive) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archive))) {
            for (Artwork work : works) {
                bw.write(work.getTitle() + "," + work.getArtist() + "," + work.getLocation() + "," +
                         work.getAwType() + "," + work.getReleaseYear());
                bw.newLine();
            }
            System.out.println("Artworks saved successfully");
        } catch (IOException e) {
            System.err.println("Error saving artworks: " + e.getMessage());
        }
    }
}
