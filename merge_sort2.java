import java.util.Scanner;



class MergeSort 
{ 
	void sort(int arr[], int l, int r) 
    { 
        if (l== r) 
        {
        		return;
        }
            
            int m = (l+r)/2; 
           // System.out.println(l+" "+m+" "+" "+r);
            
            
          
	            if(isSorted(arr,l,r))
	            {
	            		System.out.println("In sort");
	            		
	            }
            else
	            {
            	
	            	sort(arr, l, m);
	            }
            
            

    		
             
            //System.out.println(l+" "+m+" "+" "+r);
            sort(arr , m+1, r); 
            
            for(int i =0;i<arr.length;i++)
            {
            	//System.out.println(arr[i]);
            }
        		//System.out.println(l+" "+m+" "+" "+r);
            
            merge(arr, l, m, r); 
          
          
        
    }

	private boolean isSorted(int[] a,int l,int r) 
	{
		int prev = a[l];
		for (int i = l; i <=r;i++) 
		{
			if (a[i] < prev) 
			{
				return false;
	       }
			System.out.println("In firtsr");
			System.out.println(i);
			prev = a[i];
		}
	   return true;
	}

	
	
	
	private void merge(int arr[], int l, int m, int r) 
	{
		// TODO Auto-generated method stub
		
		int i, j, k; 
	    int n1 = m - l + 1; 
	    int n2 =  r - m; 
	  
	    /* create temp arrays */
	  
	    
	    
	    int[] L = new int[n1+1];
		int[] R = new int[n2+1];
	    
		
		
		
		
	    /* Copy data to temp arrays L[] and R[] */
	    for (i = 0; i <n1; i++) 
	    {
	        L[i] = arr[l+i];
	    }
	    for (j = 0; j <n2; j++)
	    {
	        R[j] = arr[m + 1+ j];
	    }
	  
	    
	    i = 0; // Initial index of first subarray 
	    j = 0; // Initial index of second subarray 
	   
	  
	    
	    
	    i = 0; // Initial index of first subarray 
	    j = 0; // Initial index of second subarray 
	    k = l; // Initial index of merged subarray 
	    
	    int x = (Math.max(L[n1-1],R[n2-1])+1);
	    
	    
	    L[n1]=x;
	   R[n2]=x;
	    for (k=l;k<=r;k++)
	    {
	    	
	    		
	    	
	  
	    		if(L[i] < R[j])
	    		{
	    				//System.out.println("Filling index"+k+"with"+L[i]);
	    			 	arr[k] = L[i]; 
	 	            i++; 
	    		}
	    		else
	    		{
	    			//System.out.println("Filling index"+k+"with"+R[j]); 
	    			arr[k] = R[j]; 
	 	            j++; 
	    		}
	    		
	    		
	    
	    }
	    
}

}

public class merge_sort2 
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		
		int arr[] = {3,5,7,2,9,1}; 
		  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
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


