
public class Max_Subarray_Sum
{
	public static void main(String[] args) 
    { 
    int arr[] = {-1,3,4,-5,9,-2}; 
    int n = arr.length; 
    int max_sum = maxSubArraySum(arr, 0, n-1); 
      
    System.out.println("Maximum contiguous sum is "+ max_sum); 
    }
	
	
	static int maxSubArraySum(int arr[], int l, int h) 
{ 

			if (l == h) 
			return arr[l]; 
			
			int m = (l + h)/2; 
			
			
			int i =Math.max
					(
							Math.max
							
							(
									maxSubArraySum(arr, l, m), 
					
					
					maxSubArraySum(arr, m+1, h)), 
					
					
					maxCrossingSum(arr, l, m, h));
					
			System.out.println(i);
			
			return i;
			
}


	private static int maxCrossingSum(int[] arr, int l, int m, int h) 
	{
// Include elements on left of mid. 
				int sum = 0; 
				int left_sum = Integer.MIN_VALUE; 
				for (int i = m; i >= l; i--) 
				{ 
				sum = sum + arr[i]; 
				if (sum > left_sum) 
				left_sum = sum; 
				} 
				
				// Include elements on right of mid 
				sum = 0; 
				int right_sum = Integer.MIN_VALUE; 
				for (int i = m + 1; i <= h; i++) 
				{ 
				sum = sum + arr[i]; 
				if (sum > right_sum) 
				right_sum = sum; 
				} 
				
				// Return sum of elements on left 
				// and right of mid 
				return left_sum + right_sum; 
} 
		
	
	
	
} 

