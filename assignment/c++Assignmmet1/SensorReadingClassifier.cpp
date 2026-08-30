//============================================================================
// Name        : SensorReadingClassifier.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
int statuscode(double reading)
{
	if(reading <0)
		return -1;
	else if( reading <=29)
		return 0;
	else if (reading<=44)
		return 1;
	else if(reading<=59)
		return 2;
	else
		return 3;
}
void StatuslabelAction(int status)
{
	switch(status)
	{
	case -1 : cout <<"Status label:" << "Sensor_error" <<endl;
	         cout <<"Action" << "sensor fault-check wiring" <<endl;
	       break;
	case 0 : cout <<"Status label:" << "normal" <<endl;
		       cout <<"Action" << "no action required" <<endl;
		       break;
	case 1 : cout <<"Status label :" << "warning" <<endl;
		       cout <<"Action" << "Alert sent to supervisor" <<endl;
		       break;
	case 2  : cout <<"Status label :" << "critical" <<endl;
			       cout <<"Action :" << "cooling System triggered" <<endl;
			       break;
	default : cout <<"Status label:" << "shutdown" <<endl;
    cout <<"Action" << "emergrncy shutdown initiated" <<endl;

	}
}

int main() {
	double reading;
	cout<<"Temperature:" ;
	cin>>reading;
	int fahrenhit =(reading *9/5)+32;
	cout<< "Temperature:" << reading << "/" <<fahrenhit <<endl;
	int status= statuscode(reading);
	StatuslabelAction( status);
	(reading > 25) ? cout <<"Above Average" << endl : cout <<"below average";

	return 0;
}
