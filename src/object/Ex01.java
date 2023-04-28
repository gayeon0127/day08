package object;

import members.Member;

/*
 * 절차지향
 * C언어 = 절차지향언어
 * 기능들로만 이루어졌으며, 함수의 집합으로 만들어짐
 * 객체지향보다 처리속도가 빠르다
 * 
 * 객체지향
 * C++, Python, Java 등의 언어
 * Class 라는 자료형으로 만들어진 것
 * 재활용이 용이하나 절차지향보다 처리속도가 느리다.
 * 
 * 클래스
 * 사용자저의 자료형
 * 변수와 기능들의 집합
 * 재활용이 편리해 만들어 사용함 
 */

public class Ex01 {
	public static void main(String[] args) {
		
		Member m = new Member();
		m.name = "홍길동";
		m.addr = "산골짜기";
		System.out.println("name : " + m.name);
		System.out.println("addr : " + m.addr);

	}

}
