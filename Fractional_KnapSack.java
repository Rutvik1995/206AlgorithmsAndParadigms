

class KnapSack
{
	
	
	
	public void find(int weigth[],int expenses[],int capacity,int item)
	{
		
		int check=0;
		int profit=0;
		System.out.println(capacity);
		
		System.out.println("--------");
		for(int k=0;k<weigth.length;k++)
		{
			System.out.println(weigth[k]);
		}
		
		System.out.println("--------");
		for(int k=0;k<expenses.length;k++)
		{
			System.out.println(expenses[k]);
		}
		
		
		for(int i =0;i<item;i++)
		{
		
			
		if(weigth[i]<=capacity)
		{
			System.out.println("in if");
			capacity = capacity-weigth[i];
			profit = profit+(expenses[i]/weigth[i])*weigth[i];
		}
		else
		{
			System.out.println("in else");
			//int differnce= weigth[i]- capacity;
			
			profit =  profit+capacity*(expenses[i]/weigth[i]);
			capacity =0;
		}
		}
		
		
		System.out.println(profit);
	}
	
}




public class Fractional_KnapSack
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("hEllo");
		int capacity;
		capacity = 50;
		
		int item=3;
		int weigth[]= {10,20,30};
		int expenses[]= {60,100,120};
				
		KnapSack e = new KnapSack();
		e.find(weigth,expenses,capacity,item);
		
				
		}
		
	}


