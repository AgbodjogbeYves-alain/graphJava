package graph;

/**
 * 
 * @author Othniel Agbodjogbe  Godefroi Roussel
 *
 */
public interface Graph {
	
	
	/**
	* Ajouter un directedEdge dans le graph
	*/
	void addEdgeDirected(Vertex debut, Vertex fin);

	/**
	* Ajouter un UndirectedEdge dans le graph
	* @param v Vertex
	* @param x Vertex
	*/
	void addEdgeUndirected(Vertex v, Vertex x);

	/**
	* Add a vertex in the graph
	* @param v vertex to add
	*/
	void addVertex(Vertex v);
	
	/**
	 * Suppression d un Vertex
	 * @param v Vertex a supprimer
	 * Propage la suppression aux autres vertex et aux relations
	 */
	public void suppressVertex(Vertex v);
	
	/**
	 * Suppression d un Vertex en connaissant son identificateur 
	 * @param numVertex Object
	 */
	public void suppressVertex(Object numVertex);
	
	/**
	 * Procedure de suppression d un Edge en connaissant son identificateur
	 * @param numEdge Object
	 * Propage la suppression de relation aux vertex
	 */
	public void suppressRelation(Object numEdge);
	
	/**
	 * Procedure de suppression d un Edge en connaissant les 2 vertex lies
	 * @param v Vertex
	 * @param x Vertex
	 */
	public void suppressRelation(Vertex v,Vertex x);
	
	
	
	/**
	 * Suppression de relation en connaissant le Edge
	 * @param e Edge
	 */
	void suppressRelation(Edge e);
	
	/**
	 * Renvoi le nombre de Vertex du Graph
	 * @return int 
	 */
	int cardGraph();
	
	
	/**
	 * Renvoi les vertex relies par le Edge passé en parametre
	 * @param e Edge
	 * @return Vertex
	 */
	public Vertex[] foundVertex(Edge e);
	
	/**
	 * Retrouver le Edge qui lie les 2 vertex passés en parametre
	 * @param x Vertex
	 * @param v Vertex
	 * @return Edge
	 */
	public Edge foundEdge(Vertex x, Vertex v);
	

}
