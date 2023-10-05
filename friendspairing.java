public class friendspairing {
    public static int ways(int n) {
		if(n==1 || n==2) {
			return n;
		}
		
		//single
		int f1=ways(n-1);
		//pair
		int f2=ways(n-2);
		return f1+(n-1)*f2;
	}

	public static void main(String[] args) {
		int n=3;
		System.out.println(ways(n));

	}
}
