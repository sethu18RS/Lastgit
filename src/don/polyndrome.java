package don;

public class polyndrome {
	public static void main(String[] args) {
		String S="mom";
		String rev="";
		for(int i=S.length()-1;i>=0;i--)
		{
			rev=rev+S.charAt(i);
		}
		if(S.equals(rev))
		{
			System.out.println("it is an polyndrome");
		}
		else
		{
			System.out.println("it is not an polyndrome");
		}
	}

}
