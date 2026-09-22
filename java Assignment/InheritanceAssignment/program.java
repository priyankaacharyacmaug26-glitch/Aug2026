
public class program {

	public static void main(String[] args) {
		//Parent objParent= new Parent();
		//Child objChild= new Child();
		//objParent.display();
		//objChild.Display1();
		//objChild.display();
  PrimeMember member = new PrimeMember();
		  
		  System.out.println("Enter Name: ");
		  member.setName(ConsoleInput.getString());
		  
		  System.out.println("Enter Age: ");
		  member.setAge(ConsoleInput.getInt());
		  
		  System.out.println("Enter Phone Number: ");
		  member.setPhoneNumber(ConsoleInput.getInt());
		  
		  System.out.println("Enter Address: ");
		  member.setAddress(ConsoleInput.getString());
		  
		  System.out.println("Enter Salary: ");
		  member.setSalary(ConsoleInput.getString());
		  
		  System.out.println("Enter Joining Year: ");
		  member.setJoiningYear(ConsoleInput.getInt());
		  
		  System.out.println("Enter Joining Fees: ");
		  member.setJoiningFees(ConsoleInput.getfloat());
		  
		  System.out.println("Is Active (true/false): ");
		  member.setIsActive(Boolean.parseBoolean(ConsoleInput.getString()));
		  
		  member.display();


	}

}
