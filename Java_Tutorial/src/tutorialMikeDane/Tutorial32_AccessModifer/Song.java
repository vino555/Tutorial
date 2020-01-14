package tutorialMikeDane.Tutorial32_AccessModifer;

public class Song {

	private String title;
	private String artist;
	private int length;
	
	public Song(String title, String artist, int length) {
		this.title = (title);
		this.artist = (artist);
		this.length = (length);
	}
	
	public void playSong() {
		System.out.println("Playing " + this.title + " by " + this.artist + ".");
	}
}
