// Surname: Mujovo
// Name: Paulos
// Student no: 4125570
// Course: CSC211
// Year: 2023
// Assignment: Practical 1 Term 2
// File: Track.java

public class Track {
    private String title;
    private String artistName;
    private String albumTitle;
    private int trackTimeInSeconds;

    public Track() {
        title = "";
        artistName = "";
        albumTitle = "";
        trackTimeInSeconds = 0;
    }

    public Track(String title, String artistName, String albumTitle, int trackTimeInSeconds) {
        this.title = title;
        this.artistName = artistName;
        this.albumTitle = albumTitle;
        this.trackTimeInSeconds = trackTimeInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public int getTrackTimeInSeconds() {
        return trackTimeInSeconds;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public void setTrackTimeInSeconds(int trackTimeInSeconds) {
        this.trackTimeInSeconds = trackTimeInSeconds;
    }

    public String toString() {
        int minutes = trackTimeInSeconds / 60;
        int seconds = trackTimeInSeconds % 60;

        return "Track title: " + title + "\n"
                + "Artist name: " + artistName + "\n"
                + "Album title: " + albumTitle + "\n"
                + "Track time: " + minutes + " min " + seconds + " sec";
    }
}
