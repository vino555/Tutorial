package tutorialMikeDane.Tutorial28_StaticClassVariables;

public class Song {
	
	private String title;
	private String artist;
	private int length;
	private static int songCounter=0;
	
	public Song(String title, String artist, int length) {
		this.setTitle(title);
		this.setArtist(artist);
		this.setLength(length);
		songCounter++;
	}

	public static int getSongCount() {
		return songCounter;
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

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
