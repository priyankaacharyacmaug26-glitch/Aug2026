//============================================================================
// Name        : Buildingsensorgrid.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	double room[3][3];
	cout<<"enter the each room temperature:" <<endl;
	for(int i=0; i<3; i++)
	{
		for(int j=0; j<3; j++)
		{
			cin>>room[i][j];

		}

	}
	cout<< "display the room temperature:"<<endl;
	for(int i=0; i<3; i++)
	{
		for(int j=0; j<3; j++)
		{
			cout<<room[i][j] <<" ";
		}
		cout<<endl;
	}
 //find hottest room
	int hottestroom=0;
	int floor;
	int room1;
	for(int i=0; i<3;i++)
	{
		for(int j=0; j<3; j++)
		{
			if(room[i][j]>hottestroom)
			{
				hottestroom=room[i][j];
				floor=i;
				room1=j;
			}
		}

	}
	cout <<"floor-" <<floor <<"room" <<room1 <<"hottestroom temprature:" <<hottestroom <<endl;
	//hottest floor
	double sum=0;
	double average=0;
	double highestaverage=0;
	for(int i=0;i<3;i++){
	for(int j=0; j<3; j++)
	{
		sum = sum+room[i][j];

	}
	average=sum/3;
	if(average>highestaverage){
		floor=i;
	}

	}
	cout<<"hottest floor:" <<"floor " <<floor <<" average;" <<average <<endl;
	// display warning room
	int warning=0;
	for(int i=0; i<3; i++)
	{
		for(int j=0; j<3; j++)
		{
			if(room[i][j]>44)
			{
				warning++;

			}
		}

	}
	cout<<"room at warning=" <<warning <<endl;
	return 0;
}
