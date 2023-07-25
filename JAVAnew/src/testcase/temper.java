package testcase;

import java.util.Scanner;

public class temper {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("enter a celisus: ");
        int n = s.nextInt();
        double f=n*1.8f+32;
        System.out.println(f);

	}

}
