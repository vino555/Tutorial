package tutorialMikeDane;


public class Tutorial11_Methods {

	public static void main(String[] args) {

		sayHi("Coco");
		sayHi("Ben");
		sayHi("Ellen");
		
		String myName = "Vinnie";
		int myAge = 40;
		
		//Call the overloaded method, passing 2 x parameters
		sayHi(myName, myAge);
		
	}
	
	public static void sayHi(String name) {
		System.out.println("Hello " + name + "!");
		
	}
	
	//Method overload, same method name, differect parameter
	public static void sayHi(String name, int age) {
		System.out.println("Hello " + name + "! "
				+ "Can't believe you are " + age + " already!");
		
	}


}
