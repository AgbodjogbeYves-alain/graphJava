package graph;

import java.util.ArrayList;

/**
 * Classe representante un sommet du graphe
 * @author Yves-alain Agbodjogbe & Godefroi Roussel
 *
 */


public class Vertex {
	
	private Object numVertex;
	ArrayList<Vertex> relatedVertex = new ArrayList<Vertex>();
	ArrayList<Edge> relatedEdge = new ArrayList<Edge>();
	Graph g;
	
	/**
	 * Constructeur du Vertex
	 * @param num identifiant du vertex
	 */
	public Vertex(int num)
	{
		numVertex = num;
		relatedVertex = null;
		relatedEdge = null;
	}
	
	/**
	 * Constructeur du vertex
	 * @param num identifiant du vertex
	 * @param g Graphe auquel le vertex appartient vertex
	 */
	public Vertex(int num,Graph g)
	{
		this.g = g;
		numVertex = num;
		relatedVertex = null;
		relatedEdge = null;
	}
	
	/**
	 * Constructeur du Vertex
	 * @param g Graphe auquel le Vertex appartient
	 */
	public Vertex(Graph g)
	{
		this.g = g;
		numVertex = null;
		relatedVertex = null;
		relatedEdge = null;
	}
	
	
	/**
	 * Recuperer l'identifiant du sommet s'il en a un
	 * @return l'identifiant du vertex
	 */
	public Object getNumVertex() {
		return numVertex;
	}
	/**
	 *Modifier l'identifiant du sommet 
	 * @param numVertex nouvel identifiant du vertex
	 */
	public void setNumVertex(int numVertex) {
		this.numVertex = numVertex;
	}
	
	/**
	 * Reli� un autre vertex a celui ci 
	 * @param v le vertex a lier
	 * 
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
	 * Trouver un Edge reli� a ce vertex
	 * @param num identifiant du Edge
	 * @return le Edge identifi� par num
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
	
	/**
	 * Recuperer le graphe li� a ce Vertex
	 * @return graphe
	 */
	public Graph getGraph()
	{return this.g;}
	
	/**
	 * Changer le graphe li� a ce vertex
	 * @param g nouveau graphe
	 */
	public void setGraph(Graph g){
		this.g = g; 
	}
}
