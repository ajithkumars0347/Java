package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
			}
		
        System.out.println(fact);
	}

}
