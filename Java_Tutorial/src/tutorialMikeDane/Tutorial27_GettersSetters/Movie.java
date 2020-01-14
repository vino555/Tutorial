package tutorialMikeDane.Tutorial27_GettersSetters;

public class Movie {
	
	private String title;
	private String director;
	private String rating;
	
	public Movie(String title, String director, String rating) {
		this.setTitle(title);
		this.setDirector(director);
		this.setRating(rating);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		
		//Rating can only be (G, PG, PG-13, R or NR)
		if(rating.equals("G") ||rating.equals("PG") || rating.equals("PG-13") || rating.equals("R") || rating.equals("NR")) {
			this.rating = rating;
		}else {
			//Set to NR if any other value is set
			this.rating = "NR";
			System.out.println("Invalid Rating, (" + this.title + ") default to 'NR'.");
		}
		
		
	}
	
	
}
