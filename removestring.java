public class removestring{
    public static String remove(String str,StringBuilder newstr,boolean map[],int i) {
		if(i==str.length()) {
			return newstr.toString();
		}
		char ch=str.charAt(i);
		int index=ch -'a';
		if(map[index]!=true) {
			newstr.append(ch);
			map[index]=true;

		}
		return remove(str,newstr,map,i+1);
		
	}

	public static void main(String[] args) {
		String str="abcbaagh";
		StringBuilder newstr=new StringBuilder("");
		boolean map[]=new boolean[26];
        System.out.println(remove(str,newstr,map,0));
	}
}