package power2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter a Number");

	int num=scan.nextInt();

	System.out.println("Enter The Power To Which It Should Be Raised");

	int n=scan.nextInt();

	Demo2 p2 = new Demo2();

	int res=p2.raiseToPowerN(num, n);

	System.out.println(res);

	}

	}


