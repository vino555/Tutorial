package tutorialMikeDane;

public class Tutorial13_IfStatement {

	public static void main(String[] args) {
		
		boolean isMale = false;	
		boolean isTall = false;
		
		//Check isMale = true
		if(isMale) {
			System.out.println("You are a male.");
		}else {
			System.out.println("You are a female.");
		}
		
		//And Operator, both need to be true
		if(isMale && isTall) {
			System.out.println("You are a tall male.");
		}else {
			System.out.println("You are either not Male or Not Tall, or Both.");
		}
		
		//Or Operator, either need to be true
		if(isMale || isTall) {
			System.out.println("You are a either male or tall.");
		}else {
			System.out.println("You are neither male nor tall.");
		}
		
		//Or Operator, either need to be true
		if(isMale && isTall) {
			System.out.println("You are a tall male.");
		}else if(isMale && !isTall){
			System.out.println("You are a short male.");
		}else if(!isMale && isTall){
			System.out.println("You are a tall female.");
		}
		else {
			System.out.println("You are short female.");
		}
	}

}
