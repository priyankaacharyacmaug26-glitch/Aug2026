
public class PrimeMember extends Member {
	private int joiningYear;
	private double JoiningFees;
	private boolean isActive;
	
	
	
	//getter setter
	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public double getJoiningFees() {
		return JoiningFees;
	}

	public void setJoiningFees(double joiningFees) {
		JoiningFees = joiningFees;
	}

	public boolean getisActive() {
		return isActive;
	}

	public void setIaActive(boolean iaActive) {
		this.isActive = iaActive;
	}
public void display() {
	System.out.println("\n----- Member Details -----");
  	 System.out.println("Name: " + getName());
  	 System.out.println("Age: " + getAge());
  	 System.out.println("Phone Number: " + getPhone_no());
  	 System.out.println("Address: " + getAddress());
  	 System.out.println("Salary: " + getSalary());
		
  	 System.out.println("\n----- Prime Member Details -----");
	 System.out.println("Joining Year: " + getJoiningYear());
	 System.out.println("Joining Fees: " + getJoiningFees());
	 System.out.println("isActive: " + getisActive());

	
		
	}

}
