
import java.io.*; 
import java.util.*; 
/**
*	BFS for graph without recursive methods
*/
public class BreadthFirstSearchGraph {
	private int V;   					// No. of vertices 
    private LinkedList<Integer> adj[]; 	//Adjacency Lists 
  
    // Constructor 
    BreadthFirstSearchGraph(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) {
            adj[i] = new LinkedList();
		}
    } 
  
    // Function to add an edge into the graph 
    void addEdge(int v,int w) 
    { 
        adj[v].add(w); 
    } 
	public static void main(String[] args){
		BreadthFirstSearchGraph g = new BreadthFirstSearchGraph(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
		
		g.search(2);
	}
	
	public void search(int vertex){
		boolean[] visited = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		queue.add(vertex);
		visited[vertex] = true;
		
		while(!queue.isEmpty()) {
			vertex = queue.poll();
			System.out.println("Vertex:" + vertex);
			
			Iterator<Integer> iterator = adj[vertex].listIterator();
			
			while(iterator.hasNext()){
				Integer adjacent = iterator.next();
				if(!visited[adjacent]){
					visited[adjacent] = true;
					queue.add(adjacent);
				}
			}
			
		}
		
	}
}
