package main;

import controller.ArtworkManagement;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ArtworkManagement
        ArtworkManagement artworkManagement = new ArtworkManagement();
    
        artworkManagement.loadData();
        artworkManagement.Menu();
        artworkManagement.saveData();
    }
}
