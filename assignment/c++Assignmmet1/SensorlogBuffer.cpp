//============================================================================
// Name        : SensorlogBuffer.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
int printReading(double arr[],int num){

		int count=0;
		for( int i=0; i<num; i++)
		{
			if(arr[i]<0)
			{
				count++;
				continue;
			}else
			{
			cout<<arr[i] <<" ";
			}
		}
	cout<<endl;
	return count;

}
void scanReading(double arr[], int num){
		for(int i=0; i<num; i++)
		{
			if(arr[i] > 45){
				cout<<"first critical index:" <<i <<"->" <<arr[i] <<endl;
				break;
			}
		}
	}
	void minmaxavg(double arr[], int num){
		double min = arr[0];
		double max = arr[0];
		double avg;
		double sum=0;
		int count=0;
		for(int i=0; i<num; i++)
		{
			if(arr[i] > 0){
				if(min > arr[i]){
					min=arr[i];
				}
				if(max < arr[i]){
					max=arr[i];
				}
				sum += arr[i];
				count++;

			}

		}
		avg=sum/count;
	 cout<<"min="<< min <<"\t max=" <<max <<"\t avg=" << avg <<endl;
	}
	void readingtype(double arr[],int &num)
	{
		int normal =0;
		int warning=0;
		int critical=0;
		int shutdown=0;
		for(int i=0; i<num;i++)
		{
			if(arr[i] >= 0 && arr[i] <= 29){
				normal++;
			}else if(arr[i]>=30 && arr[i]<=44){
				warning++;

			}else if(arr[i] >=45 && arr[i]<=59)
			{
				critical++;
			}else if(arr[i]>=60){
				shutdown++;
			}

			}
		cout<<"normal :" <<normal <<"\t warning :" << warning <<"\t critical:"<<critical <<"\t shutdown:" <<shutdown <<endl;
	}


int main() {
	int num;

	cout << "enter all the readings number:";
			cin >> num;
	double arr[num];
	for(int i=0; i<num; i++)
	{
		cin >> arr[i];
	}
	int skipped = printReading(arr,num);
	cout <<"skipped (errors)" <<skipped <<endl;
	scanReading(arr,num);
	minmaxavg(arr,num);
	readingtype(arr,num);

	return 0;
}
