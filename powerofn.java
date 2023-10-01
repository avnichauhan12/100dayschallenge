import java.util.*;
public class powerofn {
	public static int power(int x,int n,int i,int result) {
		if(i==n) {
			return result*x;
			//System.out.println(result);		
		}
		result=result*x;
		 return power(x,n,i+1,result);
		
	}

	public static void main(String[] args) {
	
		Scanner ob=new Scanner(System.in);
        int x=ob.nextInt();
        int n=4;
        System.out.println( power(x,n,1,1));
	}

}
