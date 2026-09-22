
public class Member {
	private String name;
	private int age;
	private int Phone_no;
	private String address;
	private double salary;
	
	
	void printSalary() {
		System.out.println("Salary: "+salary);	
		
	}

//generated setters & getters
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


	public int getPhone_no() {
		return Phone_no;
	}


	public void setPhone_no(int phone_no) {
		Phone_no = phone_no;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
