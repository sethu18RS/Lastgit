package ram;

public class smallest {
	public static void main(String[] args) {
		int[] arr= {10,5,7,8,2,1};
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
	}

}
