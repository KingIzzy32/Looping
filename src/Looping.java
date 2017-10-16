import java.util.Random;
import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		Random rnd=new Random();
		//Setup Variables
		int hi;
		int low;
		int num;
		int score=0;
		int x=1;
		//Ask for hi, low, and num
		System.out.println("Welcome to the Times Tablet Challenge!");
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		System.out.println("What is the smallest number you want?");
		low=in.nextInt();
		System.out.println("How many questions do you want?");
		num=in.nextInt();
		//Loop and ask questions
		for  (x=1;x<=num;x++){
			//rnd.nextInt(range)+Lowest
			int num1=rnd.nextInt(hi-low+1)+low;
			int num2=rnd.nextInt(hi-low+1)+low;
			System.out.println("Question "+x+") "+num1+" x "+num2+" = ?");
			int ans=in.nextInt();
			if (ans==num1*num2) {
				score++;
				System.out.println("Correct!");
			}else { 
				System.out.println("Incorrect, The answer is "+(num1*num2));
			}

		}
		//Print Results
		System.out.println("You got "+score+" right out of "+num);
	
	}
}