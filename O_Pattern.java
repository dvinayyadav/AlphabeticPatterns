package AplhabeticPAtterns;

public class O_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=7;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if( (i==n-1 && j<n-1 && j>0)  || (j==n-1 && (i>0 && i<n-1)) || ((i>0 && i<n-1) && j==0) || (i==0 && j>0 && j<n-1)) {
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
