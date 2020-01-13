package tutorialMikeDane;

public class Tutorial17_While_DoWhile {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 10)
		{
			System.out.println("WHILE : The value of i : " + i);
			i++;
		}
		
		do {
			System.out.println("DO_WHILE : The value of i : " + i);
			i++;
		}while(i<=10);
	}

}
