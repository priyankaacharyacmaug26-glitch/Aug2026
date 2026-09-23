
public class GetIndex {

	public static void main(String[] args) {
		String alphabet="The Quick brown fox jumps over the lazy dogs";
		alphabet=alphabet.toLowerCase();
		System.out.println("origanal String:"+alphabet);
		for(char ch='a'; ch<='z';ch++) {
	     System.out.print(ch +"  ");
		}
	System.out.println("\n==================================");
	for(char ch='a'; ch<='z'; ch++) {
		int index=alphabet.indexOf(ch);
		if(index<9)
		{
			System.out.print(index+"  ");
		}else
			{
				System.out.print(index+"  ");
			}
		}
	}
	
	
	}


