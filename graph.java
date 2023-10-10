
import java.util.*;
public class graph {
	static class edge{
		int src;
		int dest;
		int weight;
		edge(int s,int d,int w){
			this.src=s;
			this.dest=d;
			this.weight=w;
		}
	}
	//has path
	public static boolean haspath(ArrayList<edge> gr[],int src,int dest,boolean vis[]) {
		if(src==dest) {
			return true;
		}
		vis[src]=true;
		for(int i=0;i<gr[src].size();i++) {
			int neigh=gr[src].get(i).dest;
			if(!vis[neigh] && haspath(gr,neigh,dest,vis) ) {
				return true;
			}
		}
		return false;
		
	}
	public static void dfs(ArrayList<edge> gr[],int curr,boolean vis[]) {
		//visited
		System.out.println(curr);
		vis[curr]=true;
		for(int i=0;i<gr[curr].size();i++) {
			int neib=gr[curr].get(i).dest;
			if(!vis[neib]) {
				dfs(gr,neib,vis);
			}
		}
	}
	public static void BFS(ArrayList<edge> gr[]) {//o(n)
		Queue<Integer> q=new LinkedList<>();
		boolean vis[]=new boolean[gr.length];
		q.add(0);
		while(!q.isEmpty()) {
			int curr=q.remove();
			if(!vis[curr]) {
				System.out.println(curr+" ");
				vis[curr]=true;
				for(int i=0;i<gr[curr].size();i++) {
					q.add(gr[curr].get(i).dest);
				}

				}
		}
	}
	// cycle detection
	public static boolean detectcycle(ArrayList<edge>[] graph) {
		boolean vis[]=new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			if(!vis[i]) {
				if(detectcycleutil(graph,vis,i,-1)){
				        return true;
				}
			}
		}
		return false;
	}
	//bipartite graph
	public static boolean bipartite(ArrayList<edge> graph[]) {
		int col[]=new int[graph.lenght];
		
		
	}
	public static boolean detectcycleutil(ArrayList<edge>[] graph,boolean vis[],int curr,int par) {
		vis[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			int neigh=graph[curr].get(i).dest;
			if(!vis[neigh] && detectcycle(graph,vis,neigh,curr)) {
				return true;
			}
			//case 1
			else if(vis[curr] && neigh!=par) {
				return true;
			}
			//case 2
			
		}
		return false;
	}
	public static void main(String args[]) {//o(v+e)
		int V=4;
		//Array of arrayList
		ArrayList<edge>[] gr =new ArrayList[V];
		//assign a empty array list to each index
		for(int i=0;i<V;i++) {
			gr[i]= new ArrayList<>();
		}
		// 0-vertex
		gr[0].add(new edge(0,1,5));
		//1-vertex
		gr[1].add(new edge(1,0,5));
		gr[1].add(new edge(1,2,6));
		gr[1].add(new edge(1,3,1));
		//2-vertex
		gr[2].add(new edge(2,1,6));
		gr[2].add(new edge(2,3,4));
		//3-vertex
		gr[3].add(new edge(3,1,1));
		gr[3].add(new edge(3,2,4));
		for(int i=0;i<V;i++) {
			System.out.println(gr[i]);
		}
		//print values of arraylist
		for(int k=0;k<V;k++) {
		for(int i=0;i<gr[k].size();i++) {
			System.out.println(gr[k].get(i).src+", "+gr[k].get(i).dest+","+gr[k].get(i).weight);
		}
		System.out.println();
		}
		System.out.println("bfs");
		BFS(gr);
		boolean vis[]=new boolean[V];
		dfs(gr,0,vis);
		boolean vist[]=new boolean[V];
		haspath(gr,0,5,vist);
		System.out.println(haspath(gr,0,5,vist));
		System.out.println(detectcycle(graph));
	}

}