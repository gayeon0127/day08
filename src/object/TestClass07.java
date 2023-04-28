package object;

public class TestClass07 {
	private void test() {
		// 정보은닉
	}
	
	public void test1(int num) {
		if(num==1) {
			System.out.println(111);
			return;
		}
		System.out.println("next");
		System.out.println();
	}
	
	public int test2(int n) {
		if(n==1) {
			System.out.println("test1 111");
			return 100;
		} else if(n==1) {
			System.out.println("test2 222");
			return 200;
		} else {
		System.out.println("next");
		return 0;
		}
		//return 값을 반환하지 않는 경우가 있을 때 error 발생
	}
	
	public boolean test3() {
		return true;
	}
	
	public int test4() {
		int num = 1;
		if(num==1) {
			return num;
		} return 0;
	}
	
	/*
	 *  *  모든 문제는 main 연산 압력 출력하는 기능으로 만드세요 
	 *  단, 연산 기능이 없는 경우 연산은 제외 가능
	 * 
	 
	 *  
	 *  2. 입력값이 짝/홀 구분
	 *  
	 *  3. 입력 값이 3의 배수인지 아닌지 구분 
	 *  
	 *  4. 엽력값이 소수인지 아닌지 구분
	 *  
	 *  5. 절대값을 구하는 메소드 
	 */
}
