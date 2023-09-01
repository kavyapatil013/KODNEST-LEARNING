package power;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		Demo p1=new Demo();
	    int res	=p1.raisetotwo(num);
	    System.out.println(res);
		
	}

}
