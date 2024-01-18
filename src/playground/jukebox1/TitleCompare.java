package Playground.jukebox1;

import java.util.Comparator;

public class TitleCompare implements Comparator<SongV3> {

  public int compare(SongV3 one, SongV3 two) {
    return one.getTitle().compareTo(two.getTitle());
  }
}
