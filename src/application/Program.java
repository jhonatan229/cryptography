package application;

import java.util.Scanner;

import cript.Code;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("what date you want encrypt? ");
		Code code = new Code(sc.nextLine());
		
		System.out.println("your new encrypt is: " + code.transformForCode());
		
		sc.close();
	}

}
