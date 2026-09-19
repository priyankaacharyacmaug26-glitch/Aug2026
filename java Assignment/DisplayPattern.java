
public class DisplayPattern {
	//pattern1
			public void pattern1() {
				System.out.println("print Star Pattern1");
				for(int itemp=1; itemp<=5; itemp++)
				{
					for(int jtemp=1; jtemp<=itemp; jtemp++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			//pattern2
			public void pattern2() {
				System.out.println("print Star Pattern2");
				
				for(int itemp=0; itemp<=5; itemp++)
				{
					for(int jtemp=1; jtemp<=(5-itemp); jtemp++)
					{
						System.out.print("* ");
					}
					
					System.out.println();
				}
				
			}
			public void pattern3() {
				System.out.println("print Star Pattern3");
				int num=1;
				for(int itemp=1; itemp<=4; itemp++)
				{
					
					for(int jtemp=1; jtemp<=itemp; jtemp++)
					{
						System.out.print(num +" " );
						num++;
					}
					
					System.out.println();
					
				}
				
			}
			public void pattern4() {
				System.out.println("print Star Pattern4");
				
				for(int itemp=1; itemp<=6; itemp++)
				{
					int num=1;
					for(int jtemp=1; jtemp<=itemp; jtemp++)
					{
						System.out.print(num +" " );
						num++;
					}
					
					System.out.println();
					
				}
				
			}
			public void pattern5() {
				System.out.println("print Star Pattern5");
				
	for(int itemp=0; itemp<=6; itemp++)
				{
					int num=1;
					for(int jtemp=1; jtemp<=(6-itemp); jtemp++)
					{
						System.out.print(num +" " );
						num++;
					}
					
					System.out.println();
					
				}
				
			}

}
