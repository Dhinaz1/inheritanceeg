package testcase;

import java.util.Scanner;

public class wordfinder {

	public static void main(String[] args) {
		System.out.println("Enter a sentence:");
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		String words[]=n.split("\\s");
		System.out.println(words.length);
		

	}

}
