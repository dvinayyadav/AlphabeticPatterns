package AplhabeticPAtterns;

public class Z_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			    if(i==0 || i==n-1 || (i+j==n-1)){
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
