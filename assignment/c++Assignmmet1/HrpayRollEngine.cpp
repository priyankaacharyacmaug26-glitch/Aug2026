//============================================================================
// Name        : HrpayRollEngine.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
class employee{
private:
	int emplId;
	string name;
	string department;
	char grade;
	double basicsalary;
	bool Active=true;
	static int employeeCount;

public:
    employee() : emplId(0), grade('D'), basicsalary(0.0), Active(true) {
        employeeCount++;
    }

    employee(int id, const string& n, const string& dept, char g, double salary)
        : emplId(id), name(n), department(dept), grade(g), basicsalary(salary), Active(true) {
        employeeCount++;
    }
	void setemplId( int Id){
		emplId=Id;
	}
	void setName(const string &n){
		name=n;
	}
	void setDepartment(const string &dept)
	{
		department=dept;
	}
	void setGrade(char g){
		grade=g;

	}
	void setBasicSalary(double salary){
		basicsalary=salary;

	}
	void setdeactivate(){
		Active=false;

	}
	int getEmpId() const{
		return emplId;

	}
	string getname()const{
		return name;

	}
	string getdeparment()const{
		return department;
	}
	char getgrade()const{
		return grade;
	}
	double getbasicsalary()const{
		return basicsalary;
	}
	bool getActive() const{
		return Active;
	}
	// salary computation

	double computeAllowance() const{

		        switch (grade) {
		            case 'A': return basicsalary * 0.40; // Senior / Manager
		            case 'B': return basicsalary * 0.30; // Mid-level
		            case 'C': return basicsalary * 0.20; // Junior
		            case 'D': return basicsalary * 0.10; // Trainee
		            default:  return 0.0;                // Unknown grade
		        }
	}
	double computeGrossSalary() const {
	        return basicsalary + computeAllowance();
	    }

    double computeTax() const {
        double gross = computeGrossSalary();
        if (gross <= 50000) {
            return 0.0;
        } else if (gross <= 100000) {
            return (gross - 50000) * 0.10;
        } else {
            return 5000 + (gross - 100000) * 0.20;
        }
    }

    double computeNetSalary() const {
        return computeGrossSalary() - computeTax();
    }
    void printPayslip() const {
           cout << "\n--- Payslip ---" << endl;
           cout << "Employee ID   : " << emplId << endl;
           cout << "Name          : " << name << endl;
           cout << "Department    : " << department << endl;
           cout << "Grade         : " << grade << endl;
           cout << "Basic Salary  : " << basicsalary << endl;
           cout << "Allowance......:" << computeAllowance()  << endl;
           cout << "Gross Salary  : " << computeGrossSalary() << endl;
           cout << "Tax           : " << computeTax() << endl;
           cout << "Net Salary    : " << computeNetSalary() << endl;
           cout << "Status        : " << (Active ? "Active" : "Inactive") << endl;
           cout << "----------------" << endl;
    }
    static int getEmployeeCount() {
           return employeeCount;
       }
    void acceptDetails() {
        int id;
        string n, dept;
        char g;
        double salary;

        cout << "Enter Employee ID: ";
        cin >> id;
        setemplId(id);

        cout << "Enter Name: ";
        cin.ignore(); // clear newline
        getline(cin, n);
        setName(n);

        cout << "Enter Department: ";
        getline(cin, dept);
        setDepartment(dept);

        cout << "Enter Grade (A/B/C/D): ";
        cin >> g;
        setGrade(g);

        cout << "Enter Basic Salary: ";
        cin >> salary;
        setBasicSalary(salary);
    }
};
int employee::employeeCount=0;

int main() {
	employee e1;
	employee *e2= new employee();
	employee* e3= new employee();
	e1.acceptDetails();
	e2->acceptDetails();
	e3->acceptDetails();
	delete e2;
	delete e3;


	return 0;
}
