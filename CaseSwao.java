import java.util.Scanner;
class CaseSwap
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();    //to have input from user having no space
	    String str1 =sc.next();
	    for(char ch: str.toCharArray())
	    { 
	    	
	    		str.replace('a',str1);
	    		str.replace('A',str1);
	    	}
	    	System.out.println(str);
	    }	
}