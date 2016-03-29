package graph;

/**
 * 
 * @author Othniel Agbodjogbe  Godefroi Roussel
 *
 */
public class UndirectedEdge extends Edge {
	Vertex v;
	Vertex x;
	/**
	 * Constructeur UndirectedEdge
	 * @param v Vertex 
	 * @param x Vertex
	 * @param g Graph
	 */
	public UndirectedEdge(Vertex v, Vertex x,Graph g) {
		super(v,x, g);
	}
	
	/**
	 * Fonction de recuperation d un des vertex
	 * @return vertex
	 */
	public Vertex getv(){
		return this.v;
	}
	
	/**
	 * Procedure de modification d un des vertex
	 * @param newv Vertex
	 */
	public void setv(Vertex newv){
		this.v = newv;
	}
	
	/**
	 * Fonction de recuperation d un des vertex
	 * @return Vertex
	 */
	public Vertex getx(){
		return this.x;
	}
	
	/**
	 * Procedure de modification d un des vertex
	 * @param newx Vertex
	 */
	public void setx(Vertex newx){
		this.x = newx;
	}

}
