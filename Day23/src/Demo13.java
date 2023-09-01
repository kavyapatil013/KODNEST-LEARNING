
import java.util.Scanner;
class Demo13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter score");
		int score=scan.nextInt();
		Grade grade=new Grade();
		grade.giveGrade(score);
		
		
		
		// TODO Auto-generated method stub

	}

}
