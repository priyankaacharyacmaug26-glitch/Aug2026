import java.util.Scanner;
 class MultiTable{
     static void printMultiplicationTable()
      {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int result;
         for(int i=1; 1<=10; i++)
          {
           result=num*i;
          }
   }
   public static void main(String[] args)
   {
    printMultiplicationTable();
}
}