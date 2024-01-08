package com.javaex.ex15;

public class Student extends Person {
	
	private String schoolName;
	
	public Student() {
		System.out.println("Student()");
	}
    /*
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}
    */
	public Student(String name,int age,String schoolName) {
		//부모의 생성자 호출
		
		//super(name,age);
		/*super();
		setName(name);
		setAge(age);
		*/
		super.setName(name);
		super.setAge(age);
		//자신메모리에 올리는 일
		this.schoolName =schoolName;
		System.out.println("Person(3)");
		//#생성자 규칙(상속일때)
		//main()>>자식의 생성자를 호출
		//일의 시작은 자식의 생성자가 시작(완료X)
		//자식생성자가 부모생성자를 호출
	}
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "학교:"+schoolName + " 이름:"+ getName() + " 나이:"+ getAge();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
