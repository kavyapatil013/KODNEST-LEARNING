package conditional;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter score");
		int score=scan.nextInt();
		Grade grade=new Grade();
		grade.giveGrade(score);
		
	}
}
