
public class Minimum {
 public static int findMin(int n1, int n2, int n3) {
		
		int min=0;
		
		if (n1<n2&&n1<n3) 
			min=n1;
		
		if (n2<n1&&n2<n3) 
			min=n2;
		
		if (n3<n1&&n3<n2) 
			min=n3;
		
		return min;
	}
	public static void main(String[] args) {
		
		System.out.println("Minimum od trite broja e: " + findMin(5,3,1));
	}
}
