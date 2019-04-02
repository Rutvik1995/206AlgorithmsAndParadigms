import java.util.Iterator;
import java.util.LinkedList;

class Graph
{
	 private int V;  
	 private LinkedList<Integer> adj[];
	
	
	Graph(int v)
	{
		V=v;
		adj = new LinkedList[v]; 
		
		 for (int i=0; i<v; ++i) 
		 {
	     adj[i] = new LinkedList(); 
		 }
	}
	
	public void addEdge(int v,int w)
	{
		adj[v].add(w);
	}
	
	
	public void BFS(int s) 
	{
		boolean visited[] = new boolean[V]; 
		  
        // Create a queue for BFS 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
        // Mark the current node as visited and enqueue it 
        visited[s]=true; 
        queue.add(s); 
        
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            s = queue.poll(); 
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            
            while (i.hasNext()) 
            {
            		int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            }
            
            
        }
	}
	
	
}



public class BFS {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("");
		
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		 g.BFS(2); 
	}

}
