public class grid {
	public static int ways(int n,int m,int a,int b) {
		if(a==n-1 && b==m-1) {
			return 1;
		}
		else if(a>n || b>m) {
			return 0;
		}
		
		//right
		int w1=ways(n,m,a,b+1);
		//down
		int w2=ways(n,m,a+1,b);

		return w1+w2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int m=4;
		System.out.println(ways(n,m,0,0));
		

	}

}
