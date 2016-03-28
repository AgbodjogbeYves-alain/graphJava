package graph;
/* Classe representante une arrete du graphe*/

public class Edge {
	
	int numEdge;
	Vertex[] relatedVertex = new Vertex[2];
	
	public Edge(int num){
		numEdge = num;
		relatedVertex = null;
	}
	
	public void relierSommet(Vertex v,Vertex x)
	{
		if (relatedVertex[0]== null || relatedVertex[1] == null){
		relatedVertex[0] = v;
		relatedVertex[1] = x;
		}
		else System.out.println("Cette arrete est deja lié a 2");
	}

	public int getEdge()
	{
		return this.numEdge;
	}
	
	public void setEdge(int num)
	{
		this.numEdge = num;
	}
	
	public void supprimerRelation()
	{
		if (relatedVertex[1] != null){
		this.relatedVertex[1].relatedEdge.remove(relatedVertex[1].foundEdge(numEdge));
		this.relatedVertex[1].relatedVertex.remove(relatedVertex[2]);
		this.relatedVertex[2].relatedEdge.remove(relatedVertex[1].foundEdge(numEdge));
		this.relatedVertex[2].relatedVertex.remove(relatedVertex[1]);
		this.relatedVertex = null;
		}
		else {this.relatedVertex = null;}
	}
}
