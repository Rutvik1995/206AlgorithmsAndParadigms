import java.util.Scanner;



 class merge
{
	
	 
	 
	 public void mergeSort(int a[], int n)
	 {
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
		
//		System.out.println("---------------------------");
//		System.out.println(" ");
		
		if(n<2)
		{
			return;
		}
		
		int mid = n/2;
		
		int[] l = new int[mid];
		int[] r = new int[n-mid];
		
		
		for(int i=0;i<mid;i++)
		{
			l[i]=a[i];
		}
		
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i]);
		}
//		System.out.println("---------------------------");
//		System.out.println(" ");
//		
		for(int i=mid;i<n;i++)
		{
			r[i-mid]= a[i];
		}
		for(int i=0;i<r.length;i++)
		{
			System.out.println(r[i]);
		}
//		System.out.println("---------------------------");
//		System.out.println(" ");
		
		
		mergeSort(l, mid);
//		System.out.println("after first merge");
		mergeSort(r, n - mid);
//	    System.out.println("after second merge");
	    
		
		
		
		merge(a,l,r,mid,n-mid);
		
		
		
		System.out.println("Final merge ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	 }
	 
	 
	 public void merge(int a[],int l[],int r[],int left,int right)
	 {
		 int i = 0, j = 0, k = 0;
		 
		 while (i < left && j < right) 
		 {
		        if (l[i] <= r[j]) 
		        {
		            a[k++] = l[i++];
		        }
		        
		        else 
		        {
		            a[k++] = r[j++];
		        }
		    }
		 
		    while (i < left) 
		    {
		        a[k++] = l[i++];
		    }
		    
		    while (j < right) 
		    {
		        a[k++] = r[j++];
		    }
		
	 }
	 
	 
	 
	 
	 
	 
}



public class merge_sort 
{

	public static void main(String[] args) 
	{
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = s1.nextInt();
		int[] array = new int[size];
		
		for(int i =0;i<size;i++)
		{
			System.out.println("Enter the element");
			array[i]= s1.nextInt();
		}
		
		
		
		merge m = new merge();
		
		m.mergeSort(array,array.length);
		
		
	}
}