
public class Student {
	String name;
	int roll_no;
	String Phone_no;
	String address;
	//constructor
	Student(String name,int roll_no,String Phone_no,String address){
		this.name=name;
		this.roll_no=roll_no;
		this.Phone_no=Phone_no;
		this.address=address;
	}
	//methode to diplay all details
	void Display() {
		System.out.println("name: "+name);
		System.out.println("roo_no: "+roll_no);
		System.out.println("Phone_no: "+Phone_no);
		System.out.println("Address: "+address);
	}
		
		
	}
	
	
	


