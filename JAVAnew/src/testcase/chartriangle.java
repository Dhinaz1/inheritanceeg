package testcase;
import java.util.*;

public class chartriangle {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(ch+" ");
			System.out.println();
			ch++;
		}
	}
}