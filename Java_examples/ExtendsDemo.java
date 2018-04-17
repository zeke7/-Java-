//父类
class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

//子类
class Student extends Person{
	//扩展功能
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
}

public class ExtendsDemo {

	public static void main(String[] args) {
		
		//子类继承了父类的方法
		Student stu = new Student();
		stu.setName("Zeke");
		stu.setAge(18);
		
		//扩展功能
		stu.setSchool("HQU");
		
		
	}

}
