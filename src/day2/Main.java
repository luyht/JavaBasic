package day2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//doExe1();
		doExe2();
	}
	
	public static void doExe1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số cần kiểm tra:");
		int x = scan.nextInt();
		
		if (OddTest.isOdd(x) ==true)
		{
			System.out.println("ODD");
		} else
		{
			System.out.println("EVEN");
		}
		
	}
	
	public static void doExe2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số cần kiểm tra:");
		int x = scan.nextInt();
		if (EightTest.hasEight(x) ==true) {
			System.out.println("Number has eight");
		} else {
			System.out.println("Number has not eight");
		}
	}
	

}
