package demo;
import java.util.Scanner;
public class Double {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the num value ");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
		num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
        
		
	}
	public static int doubleTheNumber(int num) {
	return num*2;
	}
}
