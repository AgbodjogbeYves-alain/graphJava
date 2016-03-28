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
		this.relatedVertex.add(v);
	}
	
	/**
	 * 
	 * @param e 
	 * Reliee une arrete a un sommet
	 */
	public void relatededge(Edge e){
		
		this.relatedEdge.add(e);
	}
	
	
	
}
