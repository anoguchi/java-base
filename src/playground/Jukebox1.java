package Playground;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox1 {

  public static void main(String[] args) {
    new Jukebox1().go();
  }

  public void go() {
    List<String> songList = MockSongs.getSongStrings();
    System.out.println(songList);
    Collections.sort(songList);
    System.out.println(songList);

    List<SongV2> songV2List = MockSongs.getSongsV2();
    // Collections.sort(songV2List); error because songV2 needs implement comparable
    System.out.println(songV2List);

    List<SongV3> songV3List = MockSongs.getSongsV3();
    Collections.sort(songV3List);
    System.out.println(songV3List);

    List<SongV4> songV4List = MockSongs.getSongsV4();
    Collections.sort(songV4List);
    System.out.println(songV4List);

    ArtistCompare artistCompare = new ArtistCompare();
    songV3List.sort(artistCompare);
    System.out.println(songV3List);

    TitleCompare titleCompare = new TitleCompare();
    songV3List.sort(titleCompare);
    System.out.println(songV3List);

    // Lambdas
    songV3List.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
    System.out.println(songV3List);

    songV3List.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
    System.out.println(songV3List);

    // SET
    HashSet<SongV3> songSet = new HashSet<>(songV3List);
    System.out.println(songSet);

    HashSet<SongV4> songSet2 = new HashSet<>(songV4List);
    System.out.println(songSet2);

    // TREESET
    Set<SongV4> songSet3 = new TreeSet<>(songV4List);
    System.out.println(songSet3);
  }
}
