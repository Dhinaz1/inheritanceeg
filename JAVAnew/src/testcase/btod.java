package testcase;

import java.util.Scanner;

public class btod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("enter a binary no: ");
        String n = s.nextLine();
        int dr=Integer.parseInt(n,2);
        System.out.println(dr);
	}

}
