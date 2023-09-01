package construct;
import java.util.Scanner;
public class Demo {
	 public static void checkGrade(int grade) {
	        if (grade > 50) {
	            System.out.println("Pass");
	        } else {
	            System.out.println("Fail");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        int grade = scanner.nextInt();

	        checkGrade(grade);
}
}