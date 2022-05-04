package collections;

import java.util.ArrayList;

class Student {
	String name;
	int age;
	String addr;

	public Student() {

	}

	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class ArrayList_Study2 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동",26,"부산");
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		String name = list.get(0).name;
		int age = list.get(0).age;
		String addr = list.get(0).addr;
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		
		int methodAge = list.get(0).getAge();
		System.out.println(methodAge);
		list.get(0).setAge(30);
		methodAge = list.get(0).getAge();
		System.out.println(methodAge);
	}
}
