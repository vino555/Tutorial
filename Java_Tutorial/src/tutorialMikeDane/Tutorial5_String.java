package tutorialMikeDane;

public class Tutorial5_String {

	public static void main(String[] args) {
		
		String phrase = "Giraffe Academy";
		
		//To UpperCase
		System.out.println(phrase.toUpperCase());
		
		//To LowerCase
		System.out.println(phrase.toLowerCase());
		
		//Length of String
		System.out.println(phrase.length());
		
		//Check to see variable contains "Academy"
		System.out.println(phrase.contains("Academy"));
		
		//Return the charater at postion 1
		System.out.println(phrase.charAt(1));
		
		//Return the IndexOf at F
		System.out.println(phrase.indexOf("ffe"));
		
		//Return the LastIndexOf at F
		System.out.println(phrase.lastIndexOf("a"));
		
		//SubString
		System.out.println(phrase.substring(8));
		System.out.println(phrase.substring(8, 11));
		System.out.println(phrase.substring(0, phrase.indexOf(" ")));

	}

}
