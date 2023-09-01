package evennumber;

public class Main {
	public static void printEvenNumbers(int n){
		for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a new line after the numbers
    }

    public static void main(String[] args) {
        int n = 30; // You can change this value to any other integer
        printEvenNumbers(n);
	}

	}

