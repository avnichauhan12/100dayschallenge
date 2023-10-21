public class subset {
	public static void Subsets(String str,int i,String n) {
		if(i==str.length()) {
			System.out.println(n);
			return;
		}
		char ch=str.charAt(i);
		Subsets(str,i+1,n+ch);
		Subsets(str,i+1,n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abc";
		String n="";
		Subsets(str,0,n);

	}

}
