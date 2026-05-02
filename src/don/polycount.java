package don;

public class polycount {
	public static void main(String[] args) {
		String[] arr= {"Hi","mathae","mom","madam","DAD"};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			String S=arr[i];
			String rev="";
			for(int j=S.length()-1;j>=0;j--)
			{
				rev=rev+S.charAt(j);
			}
			if(S.equals(rev)) {
				count++;
			}
				
		}
		System.out.println(count);
	}

}
