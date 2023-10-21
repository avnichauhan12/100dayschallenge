public class Nqueens {
	// check for placing a nqueen
	public static int count=0;
	public static boolean isSafe(int row,int col,char place[][]) {
		
		// vertical up
		for(int i=row-1;i>=0;i--) {
			if(place[i][col]=='q') {
				return false;
			}
		}
		
		// left diagonal
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
			if(place[i][j]=='q') {
				return false;
			}
		}
		//right diagonal
		for(int i=row-1,j=col+1;i>=0 && j<place.length;i--,j++) {
			if(place[i][j]=='q') {
				return false;
			}
		}
		return true;
		
	}
	public static void ways(int row,char place[][]) {
		if(row==place.length) {
			System.out.println("......chess board.......");
			for(int j=0;j<place.length;j++) {
				for(int k=0;k<place.length;k++) {
					System.out.print(place[j][k]);
				}
				System.out.println(" ");
			}
			count=count+1;
			return;
		}
		
		for(int i=0;i<place.length;i++) {
			if(isSafe(row,i,place)) {
			place[row][i]='q';
			ways(row+1,place);
			place[row][i]='.';
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		char place[][]=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				place[i][j]='.';
			}
		}
		
		ways(0,place);
		System.out.println(count);
	}

}