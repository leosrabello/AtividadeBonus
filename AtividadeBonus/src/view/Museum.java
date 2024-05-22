package view;

import java.util.ArrayList;
import java.util.List;
import model.Artwork;

public class Museum {
    private List<Artwork> artworks;

    public Museum() {
        artworks = new ArrayList<>();
    }

    public void addArtwork (Artwork artwork) {
        artworks.add(artwork);
    }

    public List<Artwork> listArtwork() {
        return artworks;
    }

    public Artwork searchByTitle(String title) {
        for (Artwork artwork : artworks) {
            if (artwork.getTitle().equalsIgnoreCase(title)) {
                return artwork;
            }
        }
        return null;
    }

    public boolean updateArtwork(String title, Artwork updateArtwork) {
        for (int i = 0; i < artworks.size(); i++) {
            if (artworks.get(i).getTitle().equalsIgnoreCase(title)) {
                artworks.set(i, updateArtwork);
                return true;
            }
        }
        return false;
    }

    public void deleteArtworkbyTitle (String title) {

        for (int i = 0; i < artworks.size(); i++) {
    
            if (artworks.get(i).getTitle().equals(title)) {
                artworks.remove(i);
                return; 
            }
        }
    }

    public List<Artwork> searchArtworkByArtist(String artist) {
        List<Artwork> result = new ArrayList<>();
        for (Artwork artwork : artworks) {
            if (artwork.getArtist().equalsIgnoreCase(artist)) {
                result.add(artwork);
            }
        }
        return result;
    }

    public List<Artwork> searchByYear(int year) {
        List<Artwork> result = new ArrayList<>();
        for (Artwork artwork : artworks) {
            if (artwork.getReleaseYear() == year) {
                result.add(artwork);
            }
        }
        return result;
    }

    public List<Artwork> searchByType (String tipo) {
        List<Artwork> result = new ArrayList<>();
        for (Artwork artwork : artworks) {
            if (artwork.getAwType().equalsIgnoreCase(tipo)) {
                result.add(artwork);
            }
        }
        return result;
    }

}