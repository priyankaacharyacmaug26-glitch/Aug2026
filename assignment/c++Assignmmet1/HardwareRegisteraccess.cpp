//============================================================================
// Name        : HardwareRegisteraccess.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
int main(){
   int statusReg = 0b10110001;   // Read-only from firmware side
    int controlReg = 0b00000000;  // Firmware writes here
    int dataReg   = 0b11001010;   // For reassignment demo

    const int* regPtr1 = &statusReg;
       cout<< "regPtr1 points to statusReg value: " << *regPtr1 << endl;
       int* const regPtr2 = &controlReg;
           *regPtr2 = 0b11110000;
           cout<< "controlReg after write via regPtr2: " << controlReg << endl;
           const int* const regPtr3 = &statusReg;
            cout<< "regPtr3 points to statusReg value: " << *regPtr3 << endl;
	return 0;
}
