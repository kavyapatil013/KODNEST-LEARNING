package number;



public class Main {
	public static void printTable(int num) {
		for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
    	int num = 5; // You can change this value to any other integer
        printTable(num);

    }
}
