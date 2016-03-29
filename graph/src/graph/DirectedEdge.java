package graph;

/**
 * 
 * @author Othniel Agbodjogbe & Godefroi Roussel
 *
 */
public class DirectedEdge extends Edge {

	Vertex debut;
	Vertex fin;

	/**
	 * Constructeur DirectedEdge
	 * @param debut Vertex de depart
	 * @param fin Vextex d'arrivee
	 * @param g graphe auquel appartient le Edge
	 */
	public DirectedEdge(Vertex debut, Vertex fin,Graph g)
	{
		super(debut,fin,g);
		
	}
	
	/**
	 * Fonction de recuperation de vertex de départ
	 * @return Vertex
	 */
	public Vertex getdebut(){
		return this.debut;
	}
	
	/**
	 * Procedure de modification de Vertex de depart
	 * @param newdebut Vertex
	 */
	public void setDebut(Vertex newdebut){
		this.debut = newdebut;
	}
	
	/**
	 *Fonction de recuperation de vertex d'arrivee 
	 * @return Vertex
	 */
	public Vertex getfin(){
		return this.fin;
	}
	
	/**
	 * Procedure de modification de Vertex d'arrivee
	 * @param newFin
	 */
	public void setFin(Vertex newFin){
		this.debut = newFin;
	}
	
}
