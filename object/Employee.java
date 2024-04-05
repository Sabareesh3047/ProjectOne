package object;

public class Employee {
	private String name;
	private int id;
	private int age;
	private String gender;
	private int salary;
	private String shift;
	public Employee(String name, int id, int age, String gender, int salary, String shift) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.shift = shift;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", salary=" + salary
				+ ", shift=" + shift + "]";
	}
	
	

}
