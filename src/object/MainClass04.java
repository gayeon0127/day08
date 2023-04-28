package object;

import java.util.Scanner;

public class MainClass04 {
public static void main(String[] args) {
		
		System.out.println("main start");
		
		Scanner scan = new Scanner(System.in);
		int num=0, sum=0;
		System.out.println(" 수 입력 : " );
		num=scan.nextInt();
		
		TestClass04 t = new TestClass04();
		t.sumFunc(num);
		// parameter ; 인자값, 메소드에 넘기는 값
		System.out.println("main end");
	}
}
