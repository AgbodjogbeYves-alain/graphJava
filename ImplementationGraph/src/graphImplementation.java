import bin.Graphe;

public class graphImplementation implements Graphe {

	Vertex[][] tabvertex = new Vertex[10][10];
	Edge[][] tabEdge = new Edge[10][10];
	
	@Override
	public void addEdge(Vertex arg0, Vertex arg1) { //J'estime qu'il s'agit d'un ajout de UndirectedEdge
		UndirectedEdge e = new UndirectedEdge(null, arg0, arg1);
		int i = 0;
		int y = 0;
		boolean insere = false;
		for (i=0;i<10;i++){
			for (y=0;y<10;y++){
				if (this.tabEdge[i][y] == null){
					this.tabEdge[i][y]= e;
					insere = true;
				}
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
		int y = 0;
		boolean insere = false;
		for (i=0;i<10;i++){
			for (y=0;y<10;y++){
				if (this.tabvertex[i][y] == null){
					this.tabvertex[i][y]= arg0;
					insere = true;
				}
		
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
			for(y=0;y<10;y++){
				if (tabEdge[x][y].getName()== arg0)
				{
					tabEdge[x][y].getVertex().getFirst().removeNeighbour(tabEdge[x][y].getVertex().getSecond());//(getName));
					tabEdge[x][y].getVertex().getSecond().removeNeighbour(tabEdge[x][y].getVertex().getFirst());//(getName));
					tabEdge[x][y] = null;
				}
			}
			
		}
		
	}

	@Override
	public void removeVertex(int arg0) {
		// TODO Auto-generated method stub
		
	}

}
