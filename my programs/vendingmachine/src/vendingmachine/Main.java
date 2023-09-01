package vendingmachine;

import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode)
{
		switch(productcode)
		case 1:
		System.out.println("Cocacola");
		break;
		switch(productcode)
		case 2:
		System.out.println("Pepsi");
		break;
		case 3:
			System.out.println("Fanta");
			break;
		case 4:
			System.out.println("Jaljeera");
			break;
		case 5:
			System.out.println("Mountaindew");
			break;
		case 6:
			System.out.println("BoatGuava");
			break;
			default System.out.println("my drink");
		}
		}
		}
	}

	public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int productcode=scan.nextInt();
	getProduct(productCode);
	

}
