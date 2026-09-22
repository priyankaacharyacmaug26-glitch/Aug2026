
public class ArrayOperation {
	//3.sort of array
	public void ArrSort(int[]arr) {
		for(int itemp=0; itemp < arr.length;itemp++) {
			for(int jtemp=0; jtemp<arr.length-1-itemp; jtemp++) {
				if(arr[jtemp]>arr[jtemp+1]) {
					int temp=arr[jtemp];
					arr[jtemp]=arr[jtemp+1];
					arr[jtemp + 1]=temp;
					
				}
			}
		}
	}
	//4.sum of array elements
	public int SumArr(int[]arr) {
		int sum=0;
		for(int itemp=0; itemp<arr.length; itemp++) {
			sum=sum+arr[itemp];
			
		}
		return sum;
		
	}
	//5.copy of array:
	 public void EmptyArray(int[] arr, int[] copyArray) {
	    	
	    	for(int iTemp = 0; iTemp < arr.length; iTemp++) {
	    		copyArray[iTemp] = arr[iTemp];
	    	}
	    }

	//6.average of array elments:
	public int AverageArr(int []arr) {
		int avg=0;
		int sum=0;
		for(int itemp=0; itemp<arr.length; itemp++) {
			 sum= sum+arr[itemp];
		}
		avg=sum/arr.length;
		return avg;
	}
	//4.array max number
	public int MaxArr(int []arr) {
		int max=arr[0];
		
		for(int itemp=0; itemp<arr.length; itemp++) {
			
			if(arr[itemp]>max)
				max=arr[itemp];
		}
		return max;
	}
	//6.minmun number of array
	public int MinArr(int []arr) {
		int min=arr[0];
		for(int itemp=0; itemp<arr.length; itemp++) {
			if(arr[itemp]<min)
				min=arr[itemp];
		}
		return min;
	}
	//7.reverse array
	public void ReeverseArr(int []arr) {
		for(int itemp = arr.length; itemp<0; itemp++ ) {
			System.out.println(arr[itemp]);
		}
	}
	// 8.Modify exercise 2 Write a Java program to find the duplicate values of an array of integer values
    public void Duplicate(int[] arr) {
    		
    	for (int iTemp = 0; iTemp < arr.length; iTemp++) {
    		
    		for (int jTemp = iTemp + 1; jTemp < arr.length; jTemp++) {
    		    
    			if(arr[iTemp] == arr[jTemp]) {
    			    
    				System.out.println("Duplicate value: " + arr[iTemp]);
    			    break;
    		    }
    	    }
    	}

    }

	

}
