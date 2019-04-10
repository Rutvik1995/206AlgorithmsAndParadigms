import java.util.Iterator;
import java.util.LinkedList;

class Graph2
{
	 private int V;  
	 private LinkedList<Integer> adj[];
	
	
	Graph2(int v)
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
	
	
	public void BFS2(int s) 
	{
		boolean visited[] = new boolean[V]; 
		int values[] = new int[V];
		
		
		for(int k=0;k<values.length;k++)
		{
			values[0]=Integer.MAX_VALUE;
		}
		
		values[s]=0;
		  
        // Create a queue for BFS 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
        // Mark the current node as visited and enqueue it 
        visited[s]=true; 
        queue.add(s); 
        
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            s = queue.poll(); 
            System.out.println("Node which is explore first"+s+"and its values is  "+values[s]);
            Iterator<Integer> i = adj[s].listIterator();
            
            while (i.hasNext()) 
            {
            		int n = i.next(); 
                if (!visited[n]) 
                { 
                		int can;
                		can = values[s];
                		can = can+1;
                    visited[n] = true; 
                    values[n]=can;
                    queue.add(n); 
                } 
            }
            
            
        }
	}
	
	
}



public class BFS2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("");
		
		Graph2 g = new Graph2(8);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(3, 4);
		g.addEdge(3, 7);
		g.addEdge(4, 5);
		g.addEdge(4, 7);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 5);
		g.addEdge(6, 7);
		g.addEdge(7, 4);
		g.addEdge(7, 6);
		g.addEdge(7, 5);
		
		
		 g.BFS2(0); 
	}

}
