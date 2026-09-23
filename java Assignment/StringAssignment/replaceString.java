
public class replaceString {

	public static void main(String[] args) {
	//5.replace the String
		String str=" The Quick brown fox jumps over the lazy dog";
		System.out.println("original String:" +str);
		String Replace="fox";
		String replacewith="cat";
		str=str.replaceAll(Replace, replacewith);
		System.out.println("after replacement string: "+str);

	}

}
