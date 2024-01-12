package Playground;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {

  public static List<String> getSongStrings() {
    List<String> songs = new ArrayList<>();
    songs.add("somersault");
    songs.add("cassidy");
    songs.add("$10");
    songs.add("havana");
    songs.add("Cassidy");
    songs.add("50 Waus");
    songs.add("50 Waus");
    songs.add("50 Waus");
    return songs;
  }

  public static List<SongV2> getSongsV2() {
    List<SongV2> songs = new ArrayList<>();
    songs.add(new SongV2("somersault", "zero 7", 147));
    songs.add(new SongV2("cassidy", "grateful dead", 158));
    songs.add(new SongV2("$10", "hitchhiker", 140));
    songs.add(new SongV2("Cassidy", "grateful dead", 158));
    songs.add(new SongV2("havana", "cabello", 105));
    songs.add(new SongV2("50 ways", "simon", 102));
    songs.add(new SongV2("50 ways", "simon", 102));
    songs.add(new SongV2("50 ways", "simon", 102));
    return songs;
  }

  public static List<SongV3> getSongsV3() {
    List<SongV3> songs = new ArrayList<>();
    songs.add(new SongV3("somersault", "zero 7", 147));
    songs.add(new SongV3("cassidy", "grateful dead", 158));
    songs.add(new SongV3("$10", "hitchhiker", 140));
    songs.add(new SongV3("Cassidy", "grateful dead", 158));
    songs.add(new SongV3("havana", "cabello", 105));
    songs.add(new SongV3("50 ways", "simon", 102));
    songs.add(new SongV3("50 ways", "simon", 102));
    songs.add(new SongV3("50 ways", "simon", 102));
    return songs;
  }

  public static List<SongV4> getSongsV4() {
    List<SongV4> songs = new ArrayList<>();
    songs.add(new SongV4("somersault", "zero 7", 147));
    songs.add(new SongV4("cassidy", "grateful dead", 158));
    songs.add(new SongV4("$10", "hitchhiker", 140));
    songs.add(new SongV4("Cassidy", "grateful dead", 158));
    songs.add(new SongV4("havana", "cabello", 105));
    songs.add(new SongV4("50 ways", "simon", 102));
    songs.add(new SongV4("50 ways", "simon", 102));
    songs.add(new SongV4("50 ways", "simon", 102));
    return songs;
  }
}
