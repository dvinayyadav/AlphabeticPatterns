package AplhabeticPAtterns;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Y_PATTERN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if((i==j || i+j==n+1) && i<=n/2) {
				System.out.print("*");
			}
			else if(i>n/2 && j==(n/2)+1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	}

}
