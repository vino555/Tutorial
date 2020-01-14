package tutorialMikeDane.Tutorial27_GettersSetters;

public class App {

	public static void main(String[] args) {
		
		//Create 2 movies using constructor
		Movie movie1 = new Movie("The Avengers","Joss Whelan","PG-13");
		Movie movie2 = new Movie("Step Brothers","Adam Mc Kay","R");
		
		//Print both movies using getter methods
		System.out.println("Movie 1's Details"
				+ "\n-----------------"
				+ "\nMovie Title :\t\t" + movie1.getTitle()
				+ "\nMovie Director :\t" + movie1.getDirector()
				+ "\nMovie Rating :\t\t" + movie1.getRating());
		
		System.out.println("\nMovie 2's Details"
				+ "\n-----------------"
				+ "\nMovie Title :\t\t" + movie2.getTitle()
				+ "\nMovie Director :\t" + movie2.getDirector()
				+ "\nMovie Rating :\t\t" + movie2.getRating());
		
		//Update Director names on both movies
		movie1.setDirector("Mickey Mouse");
		movie2.setDirector("Donald Duck");

		//Print Movies details again and check if Director's name changed correctly
		System.out.println("\nAfter Set method called.");
		System.out.println("\nMovie 1's Details"
				+ "\n----------------"
				+ "\nMovie Title :\t\t" + movie1.getTitle()
				+ "\nMovie Director :\t" + movie1.getDirector()
				+ "\nMovie Rating :\t\t" + movie1.getRating());
		
		System.out.println("\nMovie 2's Details"
				+ "\n----------------"
				+ "\nMovie Title :\t\t" + movie2.getTitle()
				+ "\nMovie Director :\t" + movie2.getDirector()
				+ "\nMovie Rating :\t\t" + movie2.getRating());
		
		//Check Rating
		System.out.println("\nCheck Rating.");
		System.out.println("-------------\n");
		
		/*Check to see if we can add a rating that is not on the list of accepted ratings
		 * Should default back to 'NR'
		 */
		movie1.setRating("Bad Movie");
		System.out.println("Movie Rating :\t\t" + movie1.getRating());
		
		//Now add an acceptable rating
		movie1.setRating("PG");
		System.out.println("Movie Rating :\t\t" + movie1.getRating());
		
		movie2.setRating("Bad Movie");
		System.out.println("Movie Rating :\t\t" + movie2.getRating());
		
		//Now add an acceptable rating
		movie2.setRating("PG-13");
		System.out.println("Movie Rating :\t\t" + movie2.getRating());
		
	}

}
