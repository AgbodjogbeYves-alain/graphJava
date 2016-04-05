import java.util.Scanner;

public class TestImpl {
	public static void main(String[] args) {
		graphImplementation g = new graphImplementation();
		int j = 0;
		Vertex[] tabvertex1 = new Vertex[100];
		Vertex[] v1 = null;
		while (j< 6){
		System.out.println("Entrez un identifiant(int) pour le vertex "+ j);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		tabvertex1[j] = new Vertex(x,null);
		j++;
		}
		int k = 0;
		while (k<6){
			System.out.println("Fait k = "+k+" 1");
			g.addVertex(tabvertex1[k]);
			k++;
			System.out.println("Fait k = "+k+" 2");
		}
		System.out.println("Voulez vous connaitre les voisins d'un sommet? tapez 1");
		Scanner sc4 = new Scanner(System.in);
		int rep = sc4.nextInt();
		
		while(rep==1){
			System.out.println("Entrez 1 numero de vertex deja present dans le graphe pour avoir ses voisins");
			Scanner sc3 = new Scanner(System.in);
			int z = sc3.nextInt();
			int c = 0;
			while(c<g.gettabvertex().length){
				if (g.gettabvertex()[c].getNumVertex()==z){
					v1 = g.gettabvertex()[c].getNeighbours(); 	
				}
				c++;
			}
			System.out.println("Les vertex auquel v1 est lié ont les identifiants suivants/n " );
			int i=0;
			while(i<v1.length){
				System.out.println(v1[i].getNumVertex());
				i++;
			}
		System.out.println("Voulez vous connaitre les voisins d'un sommet? tapez yes");
		sc4 = new Scanner(System.in);
		rep = sc4.nextInt();
		}
	}
	
}


