package tutorialMikeDane;

public class Tutorial19_ForLoop {

	public static void main(String[] args) {
		
		System.out.println("Array For Loop : ");
		//Array For Loop
		
		//Create an Array with 3 values
		String [] friends = {"Jim", "Angela", "Oscar"};
		
		//Loop around Array
		for(int k=0; k<friends.length; k++) {
			if(k!=0) {
				System.out.print(", ");
			}
			System.out.print(friends[k]);
		}
		
		//For loop below much easier to read
		System.out.println("\n\nFor Loop : ");
		for(int j=1; j<=10; j++) {
			if(j!=1) {
				System.out.print(", ");
			}
			System.out.print(j);
		}
		
		
		//Compared to below While Loop
		System.out.println("\n\nWhile Loop");
		int i=1;
		
		while(i<=10) {
			if(i!=1) {
				System.out.print(", ");
			}
			System.out.print(i);
			i++;
		}
		


	}

}
