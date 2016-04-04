import java.util.ArrayList;

import bin.Graphe;

public class graphImplementation implements Graphe {

	Vertex[][] tabvertex = new Vertex[10][10];
	Edge[][] tabEdge = new Edge[10][10];

	@Override
	public void addEdge(Vertex arg0, Vertex arg1) {
		// TODO Auto-generated method stub
		
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
		return false;
		
	}

	@Override
	public void removeEdge(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVertex(int arg0) {
		// TODO Auto-generated method stub
		
	}

}
