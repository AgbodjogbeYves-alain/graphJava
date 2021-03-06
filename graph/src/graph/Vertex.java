package graph;

import java.util.ArrayList;

/**
 * Classe representante un sommet du graphe
 * @author Yves-alain Agbodjogbe  Godefroi Roussel
 *
 */


public class Vertex {
	
	private int numVertex;
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
	@SuppressWarnings("null")
	public Vertex(Graph g)
	{
		this.g = g;
		numVertex = (Integer) null;
		relatedVertex = null;
		relatedEdge = null;
	}
	
	
	/**
	 * Recuperer l identifiant du sommet s il en a un
	 * @return l identifiant du vertex
	 */
	public int getNumVertex() {
		return this.numVertex;
	}
	/**
	 *Modifier l identifiant du sommet 
	 * @param numVertex nouvel identifiant du vertex
	 */
	public void setNumVertex(int numVertex) {
		this.numVertex = numVertex;
	}
	
	/**
	 * Relier un autre vertex a celui ci 
	 * @param v le vertex a lier
	 * Modifie la liste des Vertex qui sont lies a celui ci
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
	 * Permet de recuperer les voisins d'un sommet
	 * @return
	 */
	public ArrayList<Vertex> getNeighbors(){
		return this.relatedVertex;
	}
		
	/**
	 * Trouver un Edge relie a ce vertex
	 * @param numEdge identifiant du Edge
	 * @return 
	 */
	public int foundEdge(int numEdge)
	{
		Edge x = null;
		for(Edge e : relatedEdge)
			if (e.numEdge == numEdge){
				x = e;
			}
		return x.numEdge;
	}
	
	/**
	 * Recuperer le graphe lie a ce Vertex
	 * @return graphe
	 */
	public Graph getGraph()
	{return this.g;}
	
	/**
	 * Changer le graphe lie a ce vertex
	 * @param g nouveau graphe
	 */
	public void setGraph(Graph g){
		this.g = g; 
	}
}
