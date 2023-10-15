public class climbingstair {
	// tabulation
	public static int countways(int n) {
		int dp[]=new int[n+1];
		dp[0]=1;
		for(int i=1;i<n+1;i++) {
			if(i==1) {
				dp[i]=dp[i-1];
			}
			else {
				dp[i]=dp[i-1]+dp[i-2];
			}
		}
		return dp[n];
	}
	public static int ways(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		return ways(n-1)+ways(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//ways(n);
System.out.println(ways(n));
	}

}
