


class QuickSort
{
	public void quicksort(int arr[], int p, int r)
	{
		if(p<r)
		{
			
		int q=partition(arr,p,r);
		//System.out.println(q);
		quicksort(arr,p,q-1);
		quicksort(arr,q+1,r);
		}
	}
	
	
	public int partition(int arr[],int p, int r)
	{
		//System.out.println("Starting loop-----------");
//		for(int k=0;k<=r;k++)
//		{
//			System.out.println(arr[k]);
//		}
		//System.out.println("-------------------------");
		
		int x;
		x= arr[r]; // pivot`
		
		System.out.println(x);
		
		int i;
		i=p-1;
		
		for(int j=p;j<=(r-1);j++)
		{
			if(arr[j]<=x)
			{
				System.out.println("swap at "+arr[j]+"with"+arr[i+1]);
				int swap= arr[j];
				arr[j]=arr[i+1];
				arr[i+1]=swap;
				i++;
			}
		}
		
		
		System.out.println("swap at "+arr[r]+"with"+arr[i+1]);
		int swap = arr[i+1];
		arr[i+1]= arr[r];
		arr[r]= swap;
		
		//System.out.println("Second Loop-----------------");
//		for(int k=0;k<=r;k++)
//		{
//			System.out.println(arr[k]);
//		}
		//System.out.println("-------------------------");
		
		return i+1;
		
	}
	
}


public class quick_sort 

{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("Hello");
		
		
		
		int arr[] = {4,8,5,7}; 
		  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        QuickSort ob = new  QuickSort(); 
        ob.quicksort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 		
		
		
	}

	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

}
