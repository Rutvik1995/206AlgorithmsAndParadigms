import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class TS3
{

	int V;
	int dep_count[];
	String leaf[];
	int dep=0;
	private LinkedList<Integer> adj[]; 
	int u;
	int count=0;
	int count2=0;
	int time=0;
	String color[];
	
	 ArrayList<Integer> ReadyList = new ArrayList<Integer>();
	 ArrayList<Integer> SolutionList = new ArrayList<Integer>();
	
	
	TS3(int v)
	{
		V=v;
		color = new String[v];
		adj = new LinkedList[v];
		dep_count = new int[v];
		leaf = new String[v];
		for(int i=0;i<V;i++)
		{
			adj[i] = new LinkedList();
			dep_count[i]=0;
			color[i]="white";
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
	
	public void ct()
	{
		for(int i=0;i<V;i++)
		{
			Iterator<Integer> it = adj[i].listIterator();
		
			
//			while(it.hasNext())
//			{
//				
//				int next = it.next();
//				//System.out.println(next);
//				dep=dep_count[next];
//				dep=dep+1;
//				//System.out.println("val of dep of "+next+"   "+dep);
//				dep_count[next]=dep;
//				
//			}
			
			if(it.hasNext())
			{
				leaf[i]="yes";
			}
			else
			{
				leaf[i]="no";
			}
	
			
			
			
		}
		
		
		for(int k=0;k<leaf.length;k++)
		{
			System.out.println("Value of node "+k+" is "+leaf[k]);
		}
		
		
		for(int j=0;j<SolutionList.size();j++)
		{
			int y=SolutionList.get(j);
			
			if(leaf[y].equals("yes"))
			{
			int h =visit(y);
			System.out.println("------------------------------------------------------");
			System.out.println("the longest distance from "+y+" to the leaf node  is "+h);
			System.out.println("------------------------------------------------------");
			count2=0;
			}
			else
			{
				System.out.println(y +"  is leaf node");
			}
			
			
		}	
		
		
	}
	
	
	public int visit(int y)
	{
		
		time++;
		System.out.println("Discovered node "+y+" at  time "+time);
		//count++;
		color[y]="grey";
		
			
			Iterator<Integer> it2 = adj[y].listIterator();
			while(it2.hasNext())
			{
				
				int next = it2.next();
				
				
				System.out.println("Check node"+next);
			
//					if(leaf[next].equals("yes"))
//					{
						visit(next);
				//	}
				
				//System.out.println(next);
				//dep=dep_count[next];
				//dep=dep+1;
				//System.out.println("val of dep of "+next+"   "+dep);
				//dep_count[next]=dep;
				//System.out.println("The distance from "+y+ " to "+next+" is "+time );
			}
			System.out.println("Finish Node at "+ y+" at "+time);
			System.out.println("the time after the loop"+time);
			color[y]="black";
			
			
			System.out.println("valu of time is "+time+" value of count is  "+count2);
			if(time>count2)
			{
				System.out.println("update the distance in if loop");
				count2=time;
			
			}
			time--;
			
			System.out.println("the time after subraction"+time);
			return count2;
		}
		
		
		
		
	}
	
	





public class Topological_Sorting_deep {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		System.out.println("hello");
		
		
		TS3 g = new TS3(8);
		
		
		 	g.addEdge(0, 1); 
	        g.addEdge(1, 3); 
	        g.addEdge(2, 3);
	        g.addEdge(3, 4); 
	        g.addEdge(3, 5); 
	        g.addEdge(3, 6); 
	        g.addEdge(5, 7); 
	        g.addEdge(6, 7); 
	       
		
//		g.addEdge(5, 2); 
//	    g.addEdge(5, 0); 
//	    g.addEdge(4, 0); 
//	    g.addEdge(4, 1); 
//	    g.addEdge(2, 3); 
//	    g.addEdge(3, 1); 
		

//		g.addEdge(4, 0);
//		g.addEdge(5, 0);
//		g.addEdge(5, 2);
//		g.addEdge(2, 3);
//		g.addEdge(3, 1);
		
		g.define();
		
		
		
		
		g.ct();
	}

}
