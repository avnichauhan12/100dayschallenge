public class Binarystring {
    public static void bianry(int n,int lastplace,String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		
		if(lastplace==0) {
			 bianry(n-1,0,str+"0");
			 bianry(n-1,1,str+"1");
		}
		else {
			str=str+"0";
			 bianry(n-1,0,str);
		}
	}

	public static void main(String[] args) {
		String str="";
		int n=0;
		bianry(3,0,str);
	}

}
