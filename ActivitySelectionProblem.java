
class ActivitySelection
{
	
	public void activity(int start[],int finish[],int n)

	{
		int k=0;
		System.out.println("Activity added");
		System.out.println(k);
		
		for(int i=1;i<=n-1;i++)
		{
			if(start[i]>=finish[k])
			{
				//System.out.println(start[i]+" is greater then "+finish[k]);
			System.out.println(i);
			k=i;
			System.out.println("in hello");
			}
		
		
	}
	
}
}


public class ActivitySelectionProblem 
{
	public static void main(String args[])
	{
		
		
		int start[]  =  {1, 3, 0, 5, 8, 5};
	    int finish[] =  {2, 4, 6, 7, 9, 9};
		
	     
	    ActivitySelection e = new ActivitySelection();
	    e.activity(start,finish,6);
	     
	     
	     
		
	}

}
