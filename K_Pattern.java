package AplhabeticPAtterns;

public class K_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0) || (i+j==n-3) || (i-j==2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
