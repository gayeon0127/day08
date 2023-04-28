package object;

import java.util.Scanner;

public class TestClass04 {
public void sumFunc(int num) {
				// argument ; 매개변수, 메소드에서 받는 값
	
	int sum=0;
	for(int i=0; i<=num; i++) {
		sum +=i;
	}
	System.out.println("1~"+num+"까지의 합 : " +sum);
}
}
