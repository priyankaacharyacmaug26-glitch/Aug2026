
public class DisplayNumber {
	//diplay all odd number from 0 to 1000
		public void OddNumber()
		{
			System.out.println("diplay the odd number from 0 to 1000:");
			for(int temp=0; temp<=1000; temp++)
			{
				if(temp % 2 !=0)
					System.out.print(" "+temp);
			}

		}
		
		//display all even number from 0 to 500
		public void EvenNumber() {
			System.out.println("diplay the even number from 0 to 500:");
			for(int temp=0; temp<=500; temp++)
			{
				if(temp % 2 ==0)
					System.out.print(" "+temp);
			}

		}
		// diplay every 7th number from 1 to 200
		public void seventhnumber() {
			System.out.println("display every  7th number from 1 to 200:");
			for(int temp=0; temp<=200; temp++)
			{
				if(temp%7==0)
				System.out.println(temp);
			}
		}
		

}
