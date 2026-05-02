package don;

public class evenposition {
	public static void main(String[] args) {
		int[] arr= {0,1,2,4,5,6,7};
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
