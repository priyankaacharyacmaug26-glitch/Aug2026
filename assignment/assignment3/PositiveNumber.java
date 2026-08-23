import java.util.Scanner;

class PositiveNumber{
 static void AskForPositiveNumber(){
      int number;
    Scanner sc=new Scanner(System.in);
    do{
    System.out.println("Enter the number:");
    number=sc.nextInt();
     }
    while(number<=0);
      {
       System.out.println(" you enter the positive number:" +number);
      }
}
public static void main(String[] args)
{
  AskForPositiveNumber();
}
} 