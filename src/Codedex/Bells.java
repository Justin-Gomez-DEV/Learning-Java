package Codedex;

public class Bells {
    public static void main(String[] args) {
        MusicDownloader musicDownloader = new MusicDownloader("Pink Pony Club", "Chappell Roan", "Midwest Princess", "https://www.spotify.com/pink-pony-club.mp3", 2023);
        musicDownloader.showFileLink("Pink Pony Club");
    }
}

class MusicDownloader {
    private String songName;
    private String artistName;
    private String album;
    private String fileLink;
    private int releaseYear;

    MusicDownloader (String songName, String artistName, String album, String fileLink, int releaseYear) {
        this.songName = songName;
        this.artistName = artistName;
        this.album = album;
        this.fileLink = fileLink;
        this.releaseYear = releaseYear;
    }
    public void showFileLink(String songName) {
        if (this.songName.equalsIgnoreCase(songName)) {
            System.out.println("Link for " + songName + " is: " + fileLink);
        }
    }
}