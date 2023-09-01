
import java.util.Scanner;

public class Grade {
	public static void giveGrade(int score) {
		Scanner scan=new Scanner(System.in);
		
		if(score>=90) {
			System.out.println("A+Grade");
		}
		else if(score>=80 && score<90) {
			System.out.println("A Grade");
		}
		else if(score>=70 && score<80) {
			System.out.println("B Grade");
		}
		else if(score>=60 && score<70) {
			System.out.println("c Grade");
	    }
	}
}
		

	
