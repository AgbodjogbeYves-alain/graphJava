import bin.Graphe;

public class graphImplementation implements Graphe {

	Vertex[] tabvertex = new Vertex[100];
	Edge[] tabEdge = new Edge[100];
	
	@Override
	public void addEdge(Vertex arg0, Vertex arg1) { //J'estime qu'il s'agit d'un ajout de UndirectedEdge
		UndirectedEdge e = new UndirectedEdge(null, arg0, arg1);
		int i = 0;
		boolean insere = false;
			for (i=0;i<100;i++){
				if (this.tabEdge[i] == null){
					this.tabEdge[i]= e;
					insere = true;
				
			}
		}
		if (insere  == true){
			arg0.addNeighbour(arg1);
			arg1.addNeighbour(arg0);
		}
		else {
			System.out.println("Max Edge atteint impossible de rajoutr de liaison Edge");
		}
		
		
		
	}

	@Override
	public void addVertex(Vertex arg0) {
		int i = 0;
		boolean insere = false;
		for (i=0;i<100;i++){
			
				if (this.tabvertex[i] == null){
					this.tabvertex[i]= arg0;
					insere = true;
				}
		
		
			
		}
		if (insere  == false){
			System.out.println("Tableau de vertex plein" );
		}
	}

	@Override
	public boolean isEmpty() {
		if(this.tabvertex == null && this.tabEdge ==null){
			return true;
		}
		else {return false;}
		
	}

	@Override
	public void removeEdge(String arg0) {
		int x;
		int y;
		for (x=0;x<10;x++){
			if (tabEdge[x].getName()== arg0)
			{
					tabEdge[x].getVertex().getFirst().removeNeighbour(tabEdge[x].getVertex().getSecond());//(getName));
					tabEdge[x].getVertex().getSecond().removeNeighbour(tabEdge[x].getVertex().getFirst());//(getName));
					tabEdge[x] = null;
				}
			
			
		}
		
	}

	@Override
	public void removeVertex(int arg0) {
		// TODO Auto-generated method stub
		
	}

}
