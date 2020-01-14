package tutorialMikeDane;

public class Tutorial14_IfStatement2 {

	public static void main(String[] args) {
		
		//Call the Max method, passing in 3 numbers
		System.out.println(max(10, 20, 15));
		
		//Call the Min Method, passing in 3 numbers
		System.out.println(min(20, 15, 10));

	}
	
	//Method to return largest number from parameters passed in.
	public static int max(int num1, int num2, int num3) {
		
		if(num1 >= num2 && num1 >= num3)
		{
			return num1;
		}else if(num2 >= num1 && num2 >= num3) {
			return num2;
		}else {
			return num3;
		}
		
		
	}
	
	//Method to return largest number from parameters passed in.
	public static int min(int num1, int num2, int num3) {
		
		if(num1 <= num2 && num1 <= num3)
		{
			return num1;
		}else if(num2 <= num1 && num2 <= num3) {
			return num2;
		}else {
			return num3;
		}
		
		
	}

}
