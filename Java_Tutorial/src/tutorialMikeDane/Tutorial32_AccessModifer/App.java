package tutorialMikeDane.Tutorial32_AccessModifer;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Public access : Access from anywhere
		 * Private Access : only accessible from inside the same class
		 * Protected Access : only accessible from inside the same package
		 */
		
		Song holiday = new Song("Holiday", "Green Day", 300);
		Song rose = new Song("Rose", "Jimmy Bukcley", 300);
		
		holiday.playSong();
		rose.playSong();

	}

}
