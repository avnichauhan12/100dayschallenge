import java.util.Scanner;

public class tilingproblemday3 {
    	public static int ways(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		// vertical
		int fnm1=ways(n-1);
		//horizontal
		int fnm2=ways(n-2);
		return fnm1+fnm2;
	}

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int length=2;
		System.out.println("enter the width of a tile");
		int n=ob.nextInt();
       System .out.println(ways(n));
	}
}
