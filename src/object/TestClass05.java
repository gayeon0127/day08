package object;

public class TestClass05 {
	
	public int sumFunc(int num) {
		
	int sum=0;
	for(int i=0; i<=num; i++) {
	sum +=i;
	}
	return sum;
	// 반환타입과 자료형이 같아야 함
	// public >>int<< sumFunc(int num)
	
	/*
	 * return 
	 *  값을 돌려주며 해당 메소드를 종료
	 *  값이 없는 경우 해당 메소드만 종료
	 *  값을 돌려줄 경우 하나만 가능
	 */
	}

}
