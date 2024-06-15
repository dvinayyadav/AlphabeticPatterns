package AplhabeticPAtterns;

public class M_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n) {
					System.out.print("* ");
				}
				else if((i==j && i<=n/2+1) || (i+j==n+1 && i<=n/2)){
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
