package AplhabeticPAtterns;

public class W_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			    if(j==0 || j==n-1 || (j==i && i>=n/2) || (i+j==n-1 && i>n/2)){
			        System.out.print("* ");
			    }
			    else{
			        System.out.print("  ");
			    }
			}
			System.out.println();
}
	}

}
