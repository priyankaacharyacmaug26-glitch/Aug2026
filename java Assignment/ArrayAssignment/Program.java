
public class Program {

	public static void main(String[] args) {
		System.out.println("Enter the sizr of array");
		int size=ConsoleInput.getInt();
		int []arr=new int[size];
		System.out.println("enter array elements: ");
		for(int itemp=0; itemp<arr.length; itemp++) {
			arr[itemp]=ConsoleInput.getInt();
		}
		//create object of arrayoperation class
		ArrayOperation obj=new ArrayOperation();
		//sort of array elements
		obj.ArrSort(arr);
		System.out.println("Sorted array:");
		for(int itemp=0;itemp<arr.length; itemp++) {
			System.out.println(arr[itemp] +" ");
		}
		//sum of array element
		System.out.println(" sum of array element :"+ obj.SumArr(arr));
		//print the average of array element
		System.out.println("average of array elements:" +obj.AverageArr(arr));
		//copy of array
		 System.out.println("Copy of array:");
	        
	        int[] copyArray = new int[arr.length];
	      obj.EmptyArray(arr, copyArray);

	        for (int iTemp = 0; iTemp < arr.length; iTemp++) {
	            System.out.print(copyArray[iTemp] + " ");
	        }

		//print the max number of array
		System.out.println("max number of array: "+obj.MaxArr(arr));
		//print min number of array
		System.out.println("min number of array is "+obj.MinArr(arr));
		//reverse of array
		obj.ReeverseArr(arr);
		System.out.println("reverse array:");
		for(int itemp=0;itemp<arr.length; itemp++) {
			System.out.println(arr[itemp] +" ");
		}
		 // 8. Modify exercise 2 Write a Java program to find the duplicate values of an array of integer values
	    System.out.println();
	    obj.Duplicate(arr);


	}

}
