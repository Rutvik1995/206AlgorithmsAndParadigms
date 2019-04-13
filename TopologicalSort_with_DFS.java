//TopologicalSort_with_DFS
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Graph4
{
	int V;
	private LinkedList<Integer> adj[]; 
	
	String color[];
	int time=0;
	int value[];
	
	 ArrayList<Integer> SolutionList = new ArrayList<Integer>();
	int size;
	 
	
	Graph4(int v)
	{
		size=(v-1);
		V=v;
		adj = new LinkedList[v];
		color = new String[v];
		value= new int[v];
		
		for (int i=0; i<v; ++i) 
		{
            adj[i] = new LinkedList();
            color[i]="white";
           
		} 
		
		
	}
	
	
	public void addEdge(int v, int w)
	{
		
		adj[v].add(w);
	}
	
	public void DFS(int s) 
	{
		
		
		if(color[s].equals("white"))
		{
			utilDFS(s);
		}
		
		
		
	}
	
	
	public void print_sol()
	{
		for(int i=0;i<SolutionList.size();i++)
		{
			int t=SolutionList.get(i);
			System.out.println(t);
		}
	}
	
	
	public void utilDFS(int s)
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
				 utilDFS(n);
			 }
			
		}
		
		SolutionList.add(s);
	
		//System.out.println("Colour is converted to black of node "+s);
		color[s]="black";
		time++;
		value[s]=time;
		System.out.println("Colour is converted to black of node "+s);
		System.out.println("time at node "+s+" when colour is convered is "+time );
		System.out.println("Finish "+s+" at time "+time);
		
		
	}
	
	
	
	
}



public class TopologicalSort_with_DFS {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Graph4 g = new Graph4(8); 
		  

        System.out.println("Following is Depth First Traversal "+ 
                           "(starting from vertex 2)"); 
//        g.addEdge(0, 1); 
//        g.addEdge(1, 3); 
//        g.addEdge(2, 3); 
//        g.addEdge(3, 4); 
//        g.addEdge(3, 5); 
//        g.addEdge(3, 6); 
//        g.addEdge(5, 7); 
//        g.addEdge(6, 7); 
//        
        g.addEdge(0, 1); 
        g.addEdge(0, 3); 
        g.addEdge(1, 2); 
        g.addEdge(3, 2); 
        g.addEdge(2, 4); 
        
        g.addEdge(2, 5); 
        
        g.addEdge(5, 6); 
        g.addEdge(4, 7); 
        g.addEdge(6, 7); 
        
        

        
        
        g.DFS(0); 
        
        g.print_sol();

	}

}
