//============================================================================
// Name        : BuginsensorCAllibration.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
// call by value
void resetsensorpairv1(int reading1, int reading2)
{
	int temp=reading1;
	reading1=reading2;
	reading2=temp;

}
//call by reference
void resetsensorpairv2(int &reading1,int &reading2)
{
	int temp=reading1;
		reading1=reading2;
		reading2=temp;


}
void resetsensorpairv3(int *reading1,int *reading2)
{
	int temp=*reading1;
		*reading1=*reading2;
		*reading2=temp;


}

int main() {
	int reading1=55;
	int reading2=12;
	cout <<"-----call by value-----"<<endl;
	cout<<"before :" <<"A:" <<reading1 <<"B: " << reading2 << endl;
	resetsensorpairv1(reading1,reading2);
	cout<<"after :" <<"A:" <<reading1 <<" B: " << reading2 << endl;

	cout <<"-----call by reference-----"<<endl;
		cout<<"before :" <<"A:" <<reading1 <<" B: " << reading2 << endl;
		resetsensorpairv2(reading1,reading2);
		cout<<"after :" <<"A:" <<reading1 <<"B: " << reading2 << endl;

				cout <<"-----call by address-----"<<endl;
					cout<<"before :" <<"A:" <<reading1 <<" B: " << reading2 << endl;
					resetsensorpairv3(&reading1,&reading2);
					cout<<"after :" <<"A:" <<reading1 <<" B: " << reading2 << endl;

	return 0;
}
