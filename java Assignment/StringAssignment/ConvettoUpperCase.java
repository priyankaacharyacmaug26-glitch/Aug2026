
public class ConvettoUpperCase {

	public static void main(String[] args) {
		//6.convet all charcter into uppercase letter
		String str="The Quick Brown Fox";
		System.out.println("original String: "+str);
		
		str =str.toUpperCase();
		System.out.println("After Convert into UpperCase: "+str);
		//7.reverse String
		String str1="The quick brown fox jumps";
		String reverse="";
		System.out.println("the given String is: "+str1);
		//1.method using STring builder method
		//String reverse=new StringBuilder(str1).reverse().toString();
		//System.out.println("The String is in Reverse order: "+reverse);
		//reverse string using for loop
		for(int itemp=str1.length()-1; itemp<=0; itemp++)
		{
			reverse+=str1.charAt(itemp);
		}
		System.out.println("after the reverse String: "+reverse);

	}

}
