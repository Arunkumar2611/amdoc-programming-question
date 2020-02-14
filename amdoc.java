public class amdoc {
	static int[] max(int N, int H[])
	{
		int arr[] = new int[N];
		int count;
		for(int i=0; i<N-1; i++)
		{
			count=0;
			int current = H[i];
			for(int j=0; j<N-1-i; j++)
			{
				if(current < H[j+1+i])
				{
					current = H[j+1+i];
					count = count + 1;
				}
				System.out.println();
				System.out.println("for value of i="+i);
				System.out.println("H["+j+"]"+"The value of current is : "+current);
				System.out.println("COUNT IS : "+count);
			}
			arr[i]=count;
		}
		System.out.println("the value is : "+arr[3]);
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {34,54,67,23,11,56,92};
		int n = arr.length;
		int[] result;
		result = max(n, arr);
		for(int i=0; i<n;i++)
			System.out.print(result[i]+" ");
	}

}
