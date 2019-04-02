import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreadthFirstSearch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int vertices;
		 System.out.println("Enter the number of vertices in the graph");
		 
		 try
		 {
	            vertices = Integer.parseInt(br.readLine());
	     }
		 catch(IOException e)
		 {
	            System.out.println("An error occurred");
	            return;
	      }
		 
		 
		 int[][] matrix = new int[vertices][vertices];
		 System.out.println("Enter the adjacency matrix");
		 int i,j;
		 
		 for(i=0; i<vertices; i++)
		 {
			 for(j=0;j<vertices;j++)
			 {
				 try
				 {
	                    matrix[i][j] = Integer.parseInt(br.readLine());
	              }
				 catch (IOException e)
				 {
	                    System.out.println("An error occurred");
	             }
			 }
		 }
		 
		 int source;
	        System.out.println("Enter the source vertex");
	        try
	        {
	            source = Integer.parseInt(br.readLine());
	        }
	        catch(IOException e)
	        {
	            System.out.println("An error occurred");
	            return;
	        }
		 
	        breadthFirstSearch(matrix,source);
	}
	
	
	
	public static void breadthFirstSearch(int[][] matrix, int source)	
	{
		boolean[] visited = new boolean[matrix.length];
		
		
		
		
	}
	

}
