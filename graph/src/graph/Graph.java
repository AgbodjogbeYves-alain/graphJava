package graph;

/**
 * 
 * @author Othniel Agbodjogbe & Godefroi Roussel
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
	 * Ajout d'un Vertex
	 * @param v Vertex a ajouter
	 */
	public void ajouterSommet(Vertex v);
	
	/**
	 * Suppression d'un Vertex
	 * @param v Vertex a supprimer
	 */
	public void supprimerSommet(Vertex v);
	
	/**
	 * Suppression d'un Vertex en connaissant son identificateur 
	 * @param numVertex Object
	 */
	public void supprimerSommet(Object numVertex);
	
	/**
	 * Procedure de suppression d'un Edge en connaissant son identificateur
	 * @param numEdge Object
	 */
	public void supprimerliaison(Object numEdge);
	
	/**
	 * Procedure de suppression d'un Edge en connaissant les 2 vertex liés
	 * @param v Vertex
	 * @param x Vertex
	 */
	public void supprimerliaison1(Vertex v,Vertex x);
	
	/**
	 * Renvoi le nombre de Vertex du Graph
	 * @return int 
	 */
	int cardGraph();

	/**
	 * Suppression de liaison
	 * @param e Edge
	 */
	void supprimerliaison(Edge e);
	
	

}
