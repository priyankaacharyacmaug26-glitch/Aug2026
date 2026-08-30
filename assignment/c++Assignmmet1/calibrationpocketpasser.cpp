//============================================================================
// Name        : calibrationpocketpasser.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
bool parsepacket(const int* rawdata , int size,int** outmin, int** outmax){
	if(size <= 0){
		return false;

	}
	*outmin = const_cast<int*>(&rawdata[0]);
	*outmax = const_cast<int*>(&rawdata[0]);
	// Scan through the packet
	    for (int i = 1; i < size; ++i) {
	        if (rawdata[i] < **outmin) {
	            *outmin = const_cast<int*>(&rawdata[i]);
	        }
	        if (rawdata[i] > **outmax) {
	            *outmax = const_cast<int*>(&rawdata[i]);
	        }
	    }

	    return true;
}

int main() {
	int packet[]={45,12,67,8,55,31};
	int* minptr = nullptr;
	int* maxptr = nullptr;
	if(parsepacket(packet, 6,&minptr,&maxptr)){
		cout<<"calibration min: "<<*minptr <<endl;
		cout << "calibration max:"<< *maxptr << endl;

	}
	return 0;
}
