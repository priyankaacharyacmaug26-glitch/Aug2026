import java.util.Scanner;
class Addition
  { 
   // create methode
    static int SumOfTwoNum(int a , int b)
    {
     return a+b;
    }
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number:");
     int num1 = sc.nextInt();
System.out.println("enter the second number");
  int num2 = sc.nextInt();
   int sum= SumOfTwoNum(num1 , num2);
   System.out.println("sum of two number is:" +sum);
  }
}

    
   