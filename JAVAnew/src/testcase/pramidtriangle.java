package testcase;
import java.util.*;
public class pramidtriangle {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for (int i=0; i<=n; i++)   {
			for(int j=i;j<=n-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=1+(i*2);j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		}
}
	 
