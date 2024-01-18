package Playground.jukebox1;

public class SongV3 implements Comparable<SongV3> {

  private String title;
  private String artist;
  private int bpm;

  @Override
  public int compareTo(SongV3 s) {
    return title.compareTo(s.getTitle());
  }

  public SongV3() {}

  public SongV3(String title, String artist, int bpm) {
    this.title = title;
    this.artist = artist;
    this.bpm = bpm;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public int getBpm() {
    return bpm;
  }

  public void setBpm(int bpm) {
    this.bpm = bpm;
  }

  @Override
  public String toString() {
    return title;
  }
}
