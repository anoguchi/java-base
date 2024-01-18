package Playground.jukebox2;

import java.util.List;

public class JukeboxStreams {
    public static void main(String[] args) {
        List<Song> songs = new MockSongs().getSongs();
        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getGenre().equals("Rock"))
                .toList();

        List<Song> rockContains = songs.stream()
                .filter(song -> song.getGenre().contains("Rock"))
                .toList();

        List<String> genres = songs.stream().map(Song::getGenre).distinct().toList();

        String songTitle = "With a Little Help from My Friends";
        List<String> result = songs.stream()
                        .filter(song -> song.getTitle().equals(songTitle))
                                .map(Song::getArtist)
                                        .filter(artist -> !artist.equals("The Beatles"))
                                                .toList();

        System.out.println(rockSongs);
        System.out.println(rockContains);
        System.out.println(genres);
        System.out.println(result);

    }
}
