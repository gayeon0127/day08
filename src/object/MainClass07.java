package object;

import java.util.ArrayList;

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		t.test1(1);
		t.test2(1);
		
		ArrayList<String> arr = new ArrayList<>();
		boolean b = arr.add("aaa");
		boolean bool = t.test3();
		// return 값의 형태가 모두 일치해야 함 
	
	}
}
