package tutorialMikeDane.Tutorial28_StaticClassVariables;

public class App {

	public static void main(String[] args) {
		
		Song holiday = new Song("Holiday", "Green Day", 200);
		Song americanIdiot = new Song("America Idiot", "Green Day", 168);
		
		System.out.println(holiday.getArtist());
		System.out.println(americanIdiot.getTitle());
		
		//Print Song Counter which is a static (shared) variable
		System.out.println(holiday.getSongCount());
		System.out.println(americanIdiot.getSongCount());
		
		//Create an additional son
		Song africa = new Song("Africa", "Toto", 300);
		
		/*Print Song Counter which is a static (shared) variable
		 * 
		 * **You can also just ask the class to get static variable, Use the Class name song
		 * instead of the individual object names
		 */
		System.out.println(Song.getSongCount());
		System.out.println(Song.getSongCount());
		System.out.println(Song.getSongCount());
	}

}
