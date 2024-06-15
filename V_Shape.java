package AplhabeticPAtterns;

import java.util.Scanner;

public class V_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print(" ");
			}
			System.out.print("*");
		for(int j=(n-1-i)*2;j>0;j--){
		    System.out.print(" ");
		}
		System.out.print("*");
			System.out.println();
}

	}

}
