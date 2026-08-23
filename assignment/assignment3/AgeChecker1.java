import java.util.Scanner;
class AgeChecker1
{
   static void AgeChecker(int a)
{
      if( a<18)
      {
      System.out.println("you are a minor.");
      }
   else if(a<60)
{
    System.out.println("you are an adult.");
    }
   else
{ 
    System.out.println("you are a citizen.");
}
}

   public static void main(String[] args)
   {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the age");
    int age= sc.nextInt();
    AgeChecker(age);
   
}
}



