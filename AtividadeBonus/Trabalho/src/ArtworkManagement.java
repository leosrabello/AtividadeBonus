import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ArtworkManagement {
    private static Museum museum = new Museum();

    public static void main(String[] args) {
        loadData();
        Menu();
        saveData();
    }

    private static void Menu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Register Artwork");
            System.out.println("2. List Artworks");
            System.out.println("3. Search Artwork by title");
            System.out.println("4. Update Artwork");
            System.out.println("5. Delete Artwork");
            System.out.println("6. Quit");
            System.out.print("Choose an option: ");
            int op = Console.readInt();

            switch (op) {
                case 1:
                    ArtworkInput();
                    break;
                case 2:
                    listArtwork();
                    break;
                case 3:
                    searchByTitle();
                    break;
                case 4:
                    updateArtwork();
                    break;
                case 5:
                    deleteArtworkByTitle();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Choose a valid option!");
            }
        }
    }

    private static void ArtworkInput() {
        System.out.print("Title: ");
        String title = Console.readString();
        System.out.print("Artist: ");
        String artist = Console.readString();
        System.out.print("Location: ");
        String location = Console.readString();
        System.out.print("Artwork Type: ");
        String AwType = Console.readString();
        System.out.print("Year of Release: ");
        int releaseYear = Console.readInt();

        Artwork artwork = new Artwork(title, artist, location, AwType, releaseYear);
        museum.addArtwork(artwork);
        System.out.println("Artwork is succesfully registered.");
    }

    private static void listArtwork() {
        List<Artwork> artworks = museum.listArtwork();
        if (artworks.isEmpty()) {
            System.out.println("No artworks found.");
        } else {
            for (Artwork artwork : artworks) {
                System.out.println(artwork);
            }
        }
    }

    private static void searchByTitle() {
        System.out.print("Artwork's Title: ");
        String title = Console.readString();
        Artwork artwork = museum.searchByTitle(title);
        if (artwork != null) {
            System.out.println(artwork);
        } else {
            System.out.println("Artwork not found.");
        }
    }

    private static void updateArtwork() {
        System.out.print("Input Title to be updated: ");
        String title = Console.readString();
        Artwork artwork = museum.searchByTitle(title);
        if (artwork != null) {
            System.out.print("Updated Title: ");
            String upTitle = Console.readString();
            System.out.print("Updated Artist: ");
            String upArtist = Console.readString();
            System.out.print("Updated Location: ");
            String upLocation = Console.readString();
            System.out.print("Updated Artwork's Type: ");
            String upType = Console.readString();
            System.out.print("Updated Year of Creation: ");
            int upYear = Console.readInt();

            Artwork updatedArtwork = new Artwork(upTitle, upArtist, upLocation, upType, upYear);
            museum.updateArtwork(title, updatedArtwork);
            System.out.println("Artwork updated successfully!");
        } else {
            System.out.println("Artwork not found.");
        }
    }

    private static void deleteArtworkByTitle() {
        System.out.print("Artwork's title to be deleted: ");
        String title = Console.readString();
        museum.deleteArtworkbyTitle(title);
        System.out.println("Artwork deleted successfully!");
    }

    private static void saveData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("artworks.txt"))) {
            List<Artwork> artworks = museum.listArtwork();
            for (Artwork artwork : artworks) {
                writer.write(artwork.toString());
                writer.newLine();
            }
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    private static void loadData() {
        List<Artwork> artworks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("artworks.txt"))) {
            String ln;
            while ((ln = br.readLine()) != null) {
                String[] data = ln.split(",");
                if (data.length == 5) {
                    String title = data[0];
                    String artist = data[1];
                    String location = data[2];
                    String artworkType = data[3];
                    int releaseYear = Integer.parseInt(data[4]);
                    Artwork artwork = new Artwork(title, artist, location, artworkType, releaseYear);
                    artworks.add(artwork);
                }
            }
            System.out.println("Data loaded successfully.");
        } catch (IOException e) {
            System.err.println("Error loading data: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error formatting number: " + e.getMessage());
        }

        for (Artwork artwork : artworks) {
            museum.addArtwork(artwork);
        }
    }
}