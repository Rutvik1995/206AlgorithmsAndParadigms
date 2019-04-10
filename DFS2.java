import java.util.Iterator;
import java.util.LinkedList;

class depthFirstSearch
{

	
	int V;
	private LinkedList<Integer> adj[]; 
	
	String color[];
	int time=0;
	int value[];
	
	
	public void dfs(int v)
	{
		V=v;
		adj = new LinkedList[v];
		
		
		
		color = new String[v];
		value= new int[v];
		
		for (int i=0; i<v; ++i) 
		{
            adj[i] = new LinkedList();
            color[i]="white";
           
		} 
		for (int i=0; i<v; ++i) 
		{
			System.out.println(i);
            visit(i);
            
           
		} 
		
		
	}
	
	
	public void visit(int s)
	{
		color[s]="grey";
		time++;
		value[s]=time;
		//System.out.println(s+" value is "+value[s]);
		System.out.println("Discoverd node "+s+" at time "+time);
		Iterator<Integer> i = adj[s].listIterator();
		
	
		
		while(i.hasNext())
		{
			
			 int n = i.next(); 
			 System.out.println("Check "+n);
			 
			 if(color[n].equals("grey"))
			 {
				 System.out.println("Cyclic Graph");
			 }
			else if(color[n].equals("white"))
			 {
				 visit(n);
			 }
			
		}
		
		
		//System.out.println("Colour is converted to black of node "+s);
		color[s]="black";
		time++;
		value[s]=time;
		System.out.println("Colour is converted to black of node "+s);
		System.out.println("time at node "+s+" when colour is convered is "+time );
		System.out.println("Finish "+s+" at time "+time);
		
		
	}
	
	
	
	public void addEdge(int v, int w)
	{
		
		adj[v].add(w);
	}
	
	
}



public class DFS2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		
		depthFirstSearch g = new depthFirstSearch();
//		g.addEdge(0, 0); 
//      g.addEdge(1, 1); 
//      g.addEdge(2, 2); 
//      g.addEdge(3, 3); 
//      
      
		
//      g.addEdge(0, 1); 
//      g.addEdge(0, 2); 
//      g.addEdge(0, 3); 
//      g.addEdge(1, 0); 
//      g.addEdge(1, 3); 
//      g.addEdge(2, 0); 
//      g.addEdge(2, 3); 
//      g.addEdge(3, 0); 
//      g.addEdge(3, 1); 
//      g.addEdge(3, 2); 
      
      g.dfs(2);
 
		
	}

}
