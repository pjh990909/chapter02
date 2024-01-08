package com.javaex.ex15;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("정우성",45); 
	    System.out.println(p01.toString());
		p01.showInfo();
		
		//#상속의 이유
		//부모의 필드,메소드 꽁짜로 사용
		//부모와 자식의 메소드 이름이 같을 경우 자식의 메소드가 사용됨
		
		//굳이 같은이름으로 만드는 이유는?
		//부모의 메소드를 자식이 사용할 경우 오류가 생기는 경우(사용하면 안되는 경우)
		//그래서 같은 이름ㅇ으로 만든다
		//그러면 자식의 메소드가 사용됨
		
		//부모의 메소드도 사용하고 자식이 더 좋게 만들 경우
		//이름을 다르게 만든다
		Student s01 = new Student();
		s01.setName("정우성");
		s01.setAge(45);
		s01.setSchoolName("서울고등학교");
		System.out.println(s01.toString());
		
		Student s02  =  new Student("유재석",44,"서울고등학교");
		

	}

}
