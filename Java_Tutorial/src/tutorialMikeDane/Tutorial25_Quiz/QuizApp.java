package tutorialMikeDane.Tutorial25_Quiz;

import java.util.Scanner;

public class QuizApp {

	public static void main(String[] args) {
		

		String q1 = ("What color are apples?\n"
				+ "(a)Red/Green\n(b)Orange\n(c)Magenta\n");
		
		
		String q2 = ("What color are bananas?\n"
				+ "(a)Red/Green\n(b)Yellow\n(c)Blue\n");
		
		
		Question[] questions = {
			new Question(q1, "a"),
			new Question(q2, "b")
		};
		
		takeTest(questions);
	}
	public static void takeTest(Question[] questions) {
		int score = 0;
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = input.nextLine();
			
			//Check if inputted answer matches actual answer
			if(answer.equals(questions[i].answer))
			{
				score++;
			}
			
		}
		System.out.println("You got " + score + " out of " + questions.length + ".");
	}

}
