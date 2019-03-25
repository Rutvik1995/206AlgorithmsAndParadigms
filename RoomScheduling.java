import java.util.ArrayList;

public class RoomScheduling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		String Event[] = {"S1","S2","F1","S2","F3","S4","F4","F2"};
		
		int no = 4;
		int roomcount=0;
		
		
		ArrayList<String> FreeList = new ArrayList<String>();
		
		
		for(int i=0;i<no;i++)
		{
			FreeList.add("room:"+i+1);
		}
		
		
		
		
		for(int i=0;i<2*no-1;i++)
		{
			
			String result =EventType(Event[0]);
			
			
			
			if(result.substring(0, 1).equals("S"))
			{
			
			int number= Assignment(result);
			
			System.out.println( FreeList.get(roomcount)+" is assigned to activity "+number);
			roomcount++;
			
			}
			else
			{
				int number= Assignment(result);
		//		System.out.println( 
			}
			
			
		}
		
		
		
		
	}

	
	public static String  EventType(String type)
	{
		String h="";
		String h2="";
		String ans="";
		
		for(int i=0;i<1;i++)
        {
           h = type.substring(i);
        }
        
		for(int i=1;i<2;i++)
        {
           h2 = type.substring(i);
        }
		
		
        if(h.equals("F"))
        { 
            ans="F"+h2;
            
        }
        
        else
        {
        	 ans="S"+h2;
        }
        
		return ans;
      
		
	}
	
	public static int Assignment(String event)
	{
		String h2="";
		for(int i=1;i<2;i++)
        {
			 h2= event.substring(i);
        }
		int h3 = Integer.parseInt(h2);			
		
		return h3;
		
	}
	
}
