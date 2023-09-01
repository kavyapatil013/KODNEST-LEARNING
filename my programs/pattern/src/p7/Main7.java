package p7;

public class Main7 {
	public static void printTriangle(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				System.out.println(" ");
			}
			for(int j=0;j<=i;j++)
				System.out.println("*");
		}
		System.out.println();
		
	}
	public static void main(String[]args) {
	int n=6;
	printTriangle(n);
	
	}

}
