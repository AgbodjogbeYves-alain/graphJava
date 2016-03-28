package graph;

import java.util.ArrayList;

/* Classe representante un sommet du graphe*/


public class Vertex {
	
	private int numVertex;
	ArrayList<Vertex> relatedVertex = new ArrayList<Vertex>();
	ArrayList<Edge> relatedEdge = new ArrayList<Edge>();
	
	public Vertex(int num)
	{
		numVertex = num;
		relatedVertex = null;
		relatedEdge = null;
	}
	
	public int getNumVertex() {
		return numVertex;
	}

	public void setNumVertex(int numVertex) {
		this.numVertex = numVertex;
	}
	
	/**
	 * 
	 * @param v
	 * Relié un sommet
	 */
	public void relatevertex(Vertex v)
	{
		int num=0;
		while(this.relatedEdge.get(num) != null){num++;}
		Edge e = new Edge(num);
		this.relatedVertex.add(v);
		v.relatedVertex.add(this);
		this.relatedEdge.add(e);
		e.relierSommet(this,v);
	}
		
	/**
	 * 
	 * @param num
	 * @return
	 */
	public Edge foundEdge(int num)
	{
		Edge x = null;
		for(Edge e : relatedEdge)
			if (e.numEdge == num){
				x = e;
			}
		return x;
		
	
	}
}
