package tutorialMikeDane;

public class Tutorial20_POW_Method {

	public static void main(String[] args) {
		System.out.println(Math.pow(3, 2));
		
		System.out.println(pow(4,3));

	}
	
	//Manually create the Math.POW method
	public static int pow(int baseNum, int powNum) {
		int result = 1;
		
		for(int i = 0; i<powNum; i++) {
			result = result * baseNum;
			System.out.println("Print Result in loop : " + result);
		}
		
		return result;
	}

}
