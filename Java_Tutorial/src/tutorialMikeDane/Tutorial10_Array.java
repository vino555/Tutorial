package tutorialMikeDane;

public class Tutorial10_Array {

	public static void main(String[] args) {
		
		String[] colleagues = new String[6];
		
		colleagues[0] = "Vinita";
		colleagues[1] = "Naga";
		colleagues[2] = "Fei";
		colleagues[3] = "Luca";
		colleagues[4] = "Gian";
		colleagues[5] = "Barry";
		
		//Print the total count of array elements
		System.out.println("I have " + colleagues.length + " colleauges in my list");
		
		int counter = 0;
		for(String colleague: colleagues){
			System.out.println(colleague + " is at position " + counter);
			counter++;
		}
		
		System.out.println("\n-------------------------------------------------\n");
		
		//If you already know what values are to be stored in the Array
		String[] friends = {"Joe", "Kev", "Mickey", "Coco", "Ben", "Ellen" };
		
		//Print the total count of array elements
		System.out.println("I have " + friends.length + " Friends in my list");
		
		counter = 0;
		for(String friend: friends){
			System.out.println(friend + " is at position " + counter);
			counter++;
		}
		
		
		
		

	}

}
