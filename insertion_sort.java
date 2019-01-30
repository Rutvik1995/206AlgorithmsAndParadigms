
public class insertion_sort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int[] arr1 = {5,2,4,6,1,8,77,54};
		
		
		int n = arr1.length;
		int temp;
		
		
		for(int i =1;i<arr1.length;i++)
		{
			
			temp = arr1[i];
			
			
			for(int j = i-1; j>=0; j--)
			{
				
				if (arr1[j]>temp)
				{
					arr1[j+1]= arr1[j];
				}
				else
				{
					break;
				}
				arr1[j]= temp;
			}
				
		}
		
		
		
		for(int i =0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		
	
	}

}
