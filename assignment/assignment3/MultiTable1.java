import java.util.Scanner;
 class MultiTable1{
     static void printMultiplicationTable(int num)
      {
                
         for(int i=1; 1<=10; i++)
          {
           
          System.out.println(num + " * " + i + " = " + (num * i));
          }
   }
   public static void main(String[] args)
   {
    Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

    printMultiplicationTable(num);
}
}