package classes;

public class Person extends Breath{
	String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
