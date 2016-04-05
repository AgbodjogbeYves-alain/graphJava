

public class graphImplementation implements Graphe {

	public Vertex[] tabvertex = new Vertex[100];
	public Edge[] tabEdge = new Edge[100];
	
	
	public graphImplementation(){
		tabvertex = null;
		tabEdge = null;
	}
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
					tabEdge[x].getVertex().getFirst().removeNeighbour(tabEdge[x].getVertex().getSecond().getNumVertex());;
					tabEdge[x].getVertex().getSecond().removeNeighbour(tabEdge[x].getVertex().getFirst().getNumVertex());
					tabEdge[x] = null;
				}
			
			
		}
		
	}

	
	public boolean isIn(int arg0){
		boolean res = false;
		int i=0;
		while ( !res && i< this.tabvertex.length ){
			if (this.tabvertex[i].getNumVertex() == arg0){
				res = true;
			}
			
		}
		return res;
		
	}
	@Override
	public void removeVertex(int arg0) {
		Vertex v1 = null;
		if (isIn(arg0)==true){
			boolean trouve = false;
			int i=0;
			while ( !trouve && i< this.tabvertex.length ){
				if (this.tabvertex[i].getNumVertex() == arg0){
					trouve = true;
					v1=this.tabvertex[i];
				}
			}
			Vertex v2;
			
			for (int j=0; j<v1.getNeighbours().length; j++){
				v2=v1.getNeighbours()[j];
				for (int k=0; k<v2.getNeighbours().length; k++){
					if (v2.getNeighbours()[k]==v1){
						v2.getNeighbours()[k]=null;
					}
				}
			}
			int y=0;
			CoupleVertex v3 = new CoupleVertex(null, null);
			for (y=0; y<tabEdge.length; y++){
				v3= tabEdge[y].getVertex();
				if (v3.first==v1 || v3.second==v1){
					removeEdge(tabEdge[y].getName());
				}
			}
		this.tabvertex[i]=null;
		}
		else {
				System.out.println("Le sommet n'existe pas il n'y a pas de raison de le supprimer");
			}
			
			
	}
	
	public Vertex[] gettabvertex(){
		return this.tabvertex;
	}
	
	public Edge[] gettabEdge(){
		return this.tabEdge;
	}

}
