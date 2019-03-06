import java.util.Random;
import java.util.Scanner;

class  Trail2
{
	
	public static void InsertionSort(int data[], int size)
	{
		//Write your code here
		//System.out.println("InserionSort");
		for(int i = 1; i < size; i++)
		 {
			int temp = data[i];
			for(int j = i-1; j >= 0 && data[j] > temp; j--)
			{
				data[j+1] = data[j];
			}
		}
	}
	
	
	void quicksort2(int arr[], int low, int high) 
    { 
		
		int size = high-low;
		
        if (low>=high) 
        { 
        		return;
        }	
          
          //  int pi =  partition2(arr, low, high); 
           int pi = Median_Of_three(arr,low,high);
          
            quicksort2(arr, low, pi-1); 
            quicksort2(arr, pi+1, high); 
         
    }
	
    	
	int partition2(int arr[], int low, int high) 
    { 
        
		int n= (low+high)/2;
		
		 	
		    	
		    int value1=arr[n];
		     arr[n]=arr[high];
		    arr[high]=value1;
		    int pivot = arr[high]; 
		    
		    
		   // n += 1;
		   // System.out.println(n);
        
		
        
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
	
	
	
	private static int Median_Of_three_value(int arr[], int low, int high) 
    { 
		
		//Selecting Pivot by using median of three method
		
		int range = (high-low)+1;
		Random rn = new Random();
	    
	    
	    int[] random= new int[3];
	    for(int a=0; a<3; a++)
		{

		    random[a] = rn.nextInt(range) + low;
		}
	    
	    System.out.println("----------");
	    for(int a=0; a<3; a++)
		{

		    System.out.println(arr[random[a]]);
		}
	    System.out.println("----------");
	    
		int n;
//		n= Math.max (Math.min (random[0],random[1]), Math.min (Math.max(random[0],random[1]),random[2]));
	    
		
		if(arr[random[0]]>arr[random[1]])
		{
			
			if(arr[random[1]]>arr[random[2]])
			{
				n= random[1];
				  System.out.println(arr[random[1]]);
			}
			else if(arr[random[0]]>arr[random[2]])
			{
				n= random[2];
				System.out.println(arr[random[2]]);
			}
			else
			{
			n= random[0];	
			System.out.println(arr[random[0]]);
			}
		}
		else
		{
			if(arr[random[0]]>arr[random[2]])
			{
				n= random[0];	
				System.out.println(arr[random[0]]);
			}
			else if(arr[random[1]]>arr[random[2]])
			{
				n= random[2];
				System.out.println(arr[random[2]]);
			}
			else
			{
				n= random[1];
				System.out.println(arr[random[1]]);
			}
			
		}
		
		
		
		
		
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
		
		//swap(i+1,high,arr);
		int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
		
	
		return i+1;
	    
		
       
    } 
	
	
	
	
	
	
}









public class Trail 
{
	public static void main(String args[])
	{
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size = s1.nextInt();
		
		int[] arr = new int[size];
		
		for(int i =0;i<arr.length;i++)
		{
		
		Random rn = new Random();
		int range =100;

	    int num = rn.nextInt(100)+1 ;
		
		arr[i]=num;
		}
	    
		 printArray(arr); 
		
		
		Trail2 n = new Trail2();
		 int n1 = arr.length; 
		n.quicksort2(arr, 0, n1-1);
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
