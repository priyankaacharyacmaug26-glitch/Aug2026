
public class StringProgram {

	public static void main(String[] args) {
	
    //1. Write a Java program to get the character at the given index within the
       String str="Java Exercises!";
       //display oiginal string
       System.out.println("original string: "+str);
       //get the character at position 0
       char ch1=str.charAt(0);
       System.out.println("character at position 0:"+ch1);
       //get the character at position 10th
       char ch2= str.charAt(10);
       System.out.println("character at 10th position:"+ch2);
      //2. Write a Java program to compare two strings
       String str1="This is Execise 1";
       String str2="This is Exercise 2";
       System.out.println("string1: "+str1);
       System.out.println("string 2:"+str2);
       int result=str1.compareTo(str2);
       if(result==0) {
    	   System.out.println("\"" +str1 + "\" is equal to \""+str2+"\"");
    	   
       }else if(result<0) {
    	   System.out.println("\"" +str1 + "\" is less than \""+str2+"\"");
    	   
    	   
       }
       else
       {
    	   System.out.println("\"" +str1 + "\" is greater than \""+str2+"\"");
       }
       //3. Write a Java program to check whether a given string ends with the
       String str3="python Excercises";
       String str4="python Excercise";
       //check if str3 end with "se"

       boolean result1=str3.endsWith("se");
       System.out.println("str3 ends with se: "+result1);
       //check if str4 is ends with se
       boolean result2=str4.endsWith("se");
       System.out.println("str4 is ends with se:"+result2);
       
	}

}
