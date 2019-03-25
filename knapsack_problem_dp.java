
class KnapSack2
{
	public void find(int weight[], int value[],int c, int n)
	{
		
		
		int [] [] T = new int [n+1][c+1];
		
		
		
		for(int j=0;j<c;j++)
		{
			T[0][j]=0;
			//System.out.println(T[0][j]+" "+j);
		}
//		for(int j=0;j<c;j++)
//		{
//			System.out.print(T[0][j]+"  ");
//		}
//		System.out.println("");
//		
		
		for(int i =1;i<=n;i++)
		{
			T[i][0]=0;
			//System.out.println(T[i] [0]+"");
			//System.out.println(i);
			for( int j=0;j<=c;j++)
			{
			
				if(weight[i-1]>j)
				{
					//System.out.println(weight[i-1]+">"+j);
					T[i][j]=T[i-1][j];
					//System.out.println(T[i-1][j]);
					//System.out.println(T[i][j]);
				}
				
				else
				{
//					System.out.println("in else");
//					System.out.println(value[i-1]);
//					System.out.println(value[i-1]+T[i-1][j-weight[i-1]]);
//					//System.out.println(T[i-1][j]);
//					T[i][j]=  
//					System.out.println("hello");
//					System.out.println(T[i][j]);
					
					//System.out.println("in else");
					
					if(value[i-1]+T[i-1][j-weight[i-1]]< T[i-1][j])
					{
						T[i][j]=T[i-1][j];
					//	System.out.println(T[i][j]);
					}
					else
					{
						T[i][j]=value[i-1]+T[i-1][j-weight[i-1]];
						//System.out.println(T[i][j]);
					}
				}
				
				
				
				
				
			}
		}
		
	//	System.out.println("oo");
		System.out.println(T[n][c]);
		int i1=n;
		int j1=c;
		for(i1 =n;i1>0;i1--)
		{
			System.out.println(T[i1][j1]);
			if(T[i1][j1]>T[i1-1][j1])
			{
				System.out.println(T[i1][j1]+">"+T[i1-1][j1]);
				
				System.out.println("Item "+(i1-1)+" is taken");
				j1=j1-weight[i1-1];
			}
			
		
		
		
		
		
		}
		
		
	}
}


public class knapsack_problem_dp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("hEllo");
		int capacity;
		capacity = 8;
		
		int item=3;
		int weigth[]= {2,3,5};
		int expenses[]= {3,4,6};
				
		KnapSack2 e = new KnapSack2();
		e.find(weigth,expenses,capacity,item);
		

	}

}
