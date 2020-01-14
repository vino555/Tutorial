package tutorialMikeDane.Tutorial23_ClassesObjects;

public class App {

	public static void main(String[] args) {
		/*
		 * Create an object from the class Student
		 */
		Student myStudent = new Student();
		myStudent.firstName = "Jim";
		myStudent.lastName = "Halpert";
		myStudent.gpa = 2.3;
		myStudent.major = "Business";
		myStudent.age = 24;
		myStudent.onProbation = false;
		
		Student myStudent2 = new Student();
		myStudent2.firstName = "Mary";
		myStudent2.lastName = "Coyle";
		myStudent2.gpa = 4.3;
		myStudent2.major = "IT";
		myStudent2.age = 37;
		myStudent2.onProbation = true;
		
		System.out.println(myStudent.firstName);
		System.out.println(myStudent2.firstName);
		
		System.out.println("-----------------------------");
		
		Book myBook = new Book();
		
		myBook.author = "J. K. Rowling";
		myBook.pages = 400;
		myBook.title = "Harry Potter";
		myBook.language = "English";
		
		Book myBook2 = new Book();
		
		myBook2.author = "Tim Ferriss";
		myBook2.pages = 300;
		myBook2.title = "The 4 hour work week";
		myBook2.language = "English";
		
		System.out.println(myBook.author);
		System.out.println(myBook2.author);
		

	}

}
