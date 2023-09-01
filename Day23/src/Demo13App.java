import java.util.Scanner
public class Demo13App {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
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
		else {
			System.out.println("fail...get lost..");
		}
	}



		
		
	}

}
