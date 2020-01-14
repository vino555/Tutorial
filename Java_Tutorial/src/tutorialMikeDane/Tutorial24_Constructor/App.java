package tutorialMikeDane.Tutorial24_Constructor;

public class App {

	public static void main(String[] args) {
		
		//Create 2 books using constructor
		Book myBook = new Book("Wind and the Willow", "Vinnie Coyle", 652, "English");
		Book myBook2 = new Book("The Fall Guy", "Coco Coyle", 1120, "Spanish");
		
		//Print both Books
		System.out.println("Book 1 \n-------\nTitle : " + myBook.title
				+ "\nAuthor : " + myBook.author
				+ "\nPage Count : " + myBook.pages
				+ "\nLanguage : " + myBook.language);
		
		System.out.println("\n\nBook 2 \n------\nTitle : " + myBook2.title
				+ "\nAuthor : " + myBook2.author
				+ "\nPage Count : " + myBook2.pages
				+ "\nLanguage : " + myBook2.language);

	}

}
