

class LongestCommonSubSequence2
{
	
	
	public void do2(String n1[], String n2[], int l1,int l2)
	{
		
		int [] [] T = new int [l1+1][l2+1];
		
		
		for(int j=0;j<=l1;j++)
		{
		T[0][j]=0;
		}
		for(int j=0;j<=l1;j++)
		{
		System.out.print(T[0][j]+" ");
		}
		System.out.println("");
		
		
		for(int i=0;i<=l2;i++)
		{
		T[i][0]=0;
		System.out.println(T[i][0]);
		}
		
		
		
		
		
		
		
		
		for(int i =1;i<=l2;i++)
		{
			for(int j=1;j<=l1;j++)
			{
				if(n2[j-1].equals(n1[i-1]))
				{
					System.out.println(n2[i-1]+"is not "+n1[j-1]);
					System.out.println(i+""+j);
					System.out.println("in if");
					T[i][j]=T[i-1][j-1]+1;
				}
				else
				{
					System.out.println(n2[i-1]+"is not "+n1[j-1]);
					System.out.println(i+""+j);
					System.out.println("in else");
					T[i][j]= Math.max(T[i-1][j],T[i][j-1]);
					
				}
			}
		}
		
		
		
		
		System.out.println("last"+T[4][4]);
		
		
		
		int i1=l1;
		int j1=l2;
		
		while(i1>=1 && j1>=1)
		{
			if(n1[i1]==)
		}
		
	}
	
}






public class LongestCommonSubSequence {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello");

		String[] n1 = {"D","C","B","A"};
		String [] n2 ={"C","D","B","A"};
		System.out.println(n1.length);
		
		LongestCommonSubSequence2 LCS = new LongestCommonSubSequence2();
		LCS.do2(n1,n2,n1.length,n2.length);
		
		
		
	}

}
