package graph;
/* Classe representante une arrete du graphe*/

public class Edge {
	
	Object numEdge;
	Vertex[] relatedVertex = new Vertex[2];
	 Graph g;
	/**
	 * Constructeur d'un edge
	 * @param num identificateur du Edge
	 */
	public Edge(int num){
		numEdge = num;
		relatedVertex = null;
	}
	
	/**
	 * Constructeur d'un Edge
	 * @param v L'un des vertex que lie le Edge
	 * @param x L'un des vertex que lie le Edge
	 * @param g Le graphe auquel appartient le Edge
	 */
	public Edge(Vertex v,Vertex x,Graph g)
	{
		this.g = g;
		relatedVertex[1] = x;
		relatedVertex[0] = v;
	}
	
	/**
	 * Constructeur d'un Edge
	 * @param num identificateur du Edge
	 * @param g Le graphe auquel appartient le Edge
	 */
	public Edge(int num,Graph g){
		this.g = g;
		numEdge = num;
		relatedVertex = null;
	}
	
	/**
	 * Procedure qui permet de lier 2 Vertex
	 * @param v Vertex a lier
	 * @param x Vertex a lier
	 * Si le Edge est deja lié a 2 Vertex renvoi un erreur
	 */
	public void relierSommet(Vertex v,Vertex x)
	{
		
	}
	
	/**
	 * Renvoi l'identifiant du Edge si il en a un
	 * @return numEdge identifiant du Edge
	 */
	public Object getEdge()
	{
		return this.numEdge;
	}
	
	/**
	 * Modifie l'identifiant du Edge
	 * @param num nouvel identifiant du Edge
	 */
	public void setEdge(Object num)
	{
		this.numEdge = num;
	}
	
	/**
	 * Procedure de suppression de Edge
	 * Si le Edge est relié a au moins un Vertex supprime la relation entre le Edge et le 
	 * Vertex
	 * Sinon renvoi une erreur
	 * Propage la suppression aux Vertex concernés
	 */
	public void supprimerRelation()
	{
		
	}
}
