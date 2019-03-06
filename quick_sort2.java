import java.util.Random;

class QuickSort2
{
	void quicksort2(int arr[], int low, int high) 
    { 
        if (low>=high) 
        { 
        		return;
        }	
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi =  Median_Of_three(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            quicksort2(arr, low, pi-1); 
            quicksort2(arr, pi+1, high); 
         
    }
	
	
	int partition(int arr[], int low, int high) 
    { 
        //int pivot = arr[high]; 
        
		
		 	Random rand = new Random(arr.length-1);
		    int n = rand.nextInt(high);
		    	
		    int value1=arr[n];
		     arr[n]=arr[high];
		    arr[high]=value1;
		    int pivot = arr[high]; 
		    
		    
		   // n += 1;
		    System.out.println(n);
        
		
        
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
	
	
	
	
	
	
	
	
	int Median_Of_three(int arr[], int low, int high) 
    { 
		
		int range = (high-low)+1;
		Random rn = new Random();
	    //int n = rn.nextInt(range) + low;
	    
	    int[] random= new int[3];
	    for(int a=0; a<3; a++)
		{

		    random[a] = rn.nextInt(range) + low;
		}
	    
	    
		System.out.println("-------------");
	    for(int i=0;i<3;i++)
	    {
	    	System.out.println(random[i]);
	    }
	    
		System.out.println("-------------");
	    
		int n;
		n= Math.max (Math.min (random[0],random[1]), Math.min (Math.max(random[0],random[1]),random[2]));
	    
		int value1=arr[n];
	     arr[n]=arr[high];
	    arr[high]=value1;
		
	    int pivot = arr[high];
		int i= low-1;
		
		for(int j=low;j<high;j++)
		{
			if(arr[j]<=pivot)
			{
				int swap = arr[j];
				arr[j]=arr[i+1];
				arr[i+1]=swap;
				
				i++;
			}
		}
		
		
		int temp = arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		
		// TODO Auto-generated method stub
		return i+1;
	    
		
		
       
    } 
	
	
	
}



public class quick_sort2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int arr[] = {9,5,7,7,6,3,90,87,65,43,21,17}; 
        int n = arr.length; 
  
        QuickSort2 ob = new QuickSort2(); 
        ob.quicksort2(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 

	}
	
	
	 static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i]+" "); 
	        System.out.println(); 
	    } 

}
