import java.util.*;
public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String ,Integer> mp=new HashMap<>();
		mp.put("india", 56);
		mp.put("china", 150);
		mp.put("pakistan",7);
		System.out.println(mp);
		// get function
		int ans=mp.get("china");
		
		System.out.println(ans);
        /// containsKey
		System.out.println(mp.containsKey("india"));
	}

}