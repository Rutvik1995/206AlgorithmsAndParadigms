import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class TS2
{

	int V;
	int dep_count[];
	int dep=0;
	private LinkedList<Integer> adj[]; 
	int u;
	int count=0;
	
	TS2(int v)
	{
		V=v;
		
		adj = new LinkedList[v];
		dep_count = new int[v];
		for(int i=0;i<V;i++)
		{
			adj[i] = new LinkedList();
			dep_count[i]=0;
			
		}
		
	}
	
	
	
	public void define()
	{
		
		
		
		for(int i=0;i<V;i++)
		{
			Iterator<Integer> it = adj[i].listIterator();
			while(it.hasNext())
			{
				
				int next = it.next();
				//System.out.println(next);
				dep=dep_count[next];
				dep=dep+1;
				//System.out.println("val of dep of "+next+"   "+dep);
				dep_count[next]=dep;
				
			}
			
		}
		
		
		for(int i=0;i<V;i++)
		{
			System.out.println("Dept val of each node at "+i+" "+dep_count[i]);
		}
		
		
		
		
		
		 ArrayList<Integer> ReadyList = new ArrayList<Integer>();
		 ArrayList<Integer> SolutionList = new ArrayList<Integer>();
		 
		 
		 for(int i=0;i<V;i++)
		 {
			 if(dep_count[i]==0)
			 {
				 ReadyList.add(i);
			 }
		 }
		 
//		 
//		 for(int i=0;i<ReadyList.size();i++)
//		 {
//			 System.out.println("Element in Ready List: "+ReadyList.get(i));
//		 }
//		 System.out.println("------------------------------------------------");
//		 System.out.println("before while llop");
		 
		while(!ReadyList.isEmpty())
	      {
			 u= ReadyList.get(0);
			 for(int ip=0;ip<ReadyList.size();ip++)
			 {
				 System.out.println("Element in Ready List: in loop "+ReadyList.get(ip));
			 }
			 ReadyList.remove(0);
			 //System.out.println("the element which get extracted  from ready list "+u);
			 SolutionList.add(u);
			 
			 
			
			 System.out.println("------------------------------------------------");
			//	System.out.println("");
			 
			 for(int k=0;k<SolutionList.size();k++)
			 {
				 System.out.println("Element in Solution List in loops : "+SolutionList.get(k));
			 }
			  
				 Iterator<Integer> it = adj[u].listIterator();
				 
				 
				 while(it.hasNext())
					{
						
					 
						int next = it.next();
						//SolutionList.add(next);
						//System.out.println("Neighboor of u: "+u+" is "+next);
						//System.out.println(next);
						dep=dep_count[next];
						//System.out.println("the dep count of neighboot "+next+" is "+dep+" before subraction");
						dep=dep-1;
						//System.out.println("the dep count change  of neighboor "+next+" is "+dep+" after processing");
						//System.out.println("val of dep of "+next+"   "+dep);
						dep_count[next]=dep;
						
						
						if(dep_count[next]==0)
						 {
							count++;
							System.out.println(count);
							System.out.println("Adding the next: "+next+" to ready list");
							 ReadyList.add(next);
						 }
						
					}
			//ReadyList.remove(0);
			
			
			
			
			
	      }
		 
		
		
		System.out.println("------------------------------------------------");
		System.out.println("");
		 
		 
		 for(int i=0;i<SolutionList.size();i++)
		 {
			 System.out.println("Element in Solution List in Last : "+SolutionList.get(i));
		 }
		 
		
	}
	
	public void addEdge(int v, int w)
	{
		
		adj[v].add(w);
	}
	
	
	
	
	
}




public class Topological_Sort2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		System.out.println("hello");
		
		
		TS2 g = new TS2(6);
		
//		
//		 	g.addEdge(0, 1); 
//	        g.addEdge(1, 3); 
//	        g.addEdge(2, 3);
//	        g.addEdge(3, 4); 
//	        g.addEdge(3, 5); 
//	        g.addEdge(3, 6); 
//	        g.addEdge(5, 7); 
//	        g.addEdge(6, 7); 
	       
		
//		g.addEdge(5, 2); 
//	    g.addEdge(5, 0); 
//	    g.addEdge(4, 0); 
//	    g.addEdge(4, 1); 
//	    g.addEdge(2, 3); 
//	    g.addEdge(3, 1); 
		

		g.addEdge(4, 0);
		g.addEdge(5, 0);
		g.addEdge(5, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		
		g.define();
	}

}
