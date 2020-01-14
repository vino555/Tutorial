package tutorialMikeDane.Tutorial26_ClassesObjects;

public class App {

	public static void main(String[] args) {
		
		Student student1 = new Student("Mike", "Computer Science", 3.2);
		Student student2 = new Student("Coco", "Agricultural Science", 4.7);
		
		System.out.println("Is " + student1.name + " on the Honour Role : " + student1.isOnHonourRole());
		System.out.println("Is " + student2.name + " on the Honour Role : " + student2.isOnHonourRole());

	}

}
