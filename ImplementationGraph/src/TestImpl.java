import java.util.Scanner;

public class TestImpl {
	public static void main() {
		graphImplementation g = new graphImplementation();
		int j = 0;
		Vertex[] tabvertex = new Vertex[100];
		Vertex[] v1 = null;
		while (j!= 6){
		System.out.println("Entrez un identifiant(int) pour le vertex "+ j);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		tabvertex[j] = new Vertex(x,null);
		}
		int k = 0;
		while (k!= 6){
		g.addVertex(tabvertex[j]);
		}
		System.out.println("Voulez vous connaitre les voisins d'un sommet? tapez yes");
		Scanner sc4 = new Scanner(System.in);
		String rep = sc4.nextLine();
		
		while(rep=="yes"){
		System.out.println("Entrez 1 numero de vertex deja present dans le graphe pour avoir ses voisins");
		Scanner sc3 = new Scanner(System.in);
		int z = sc3.nextInt();
		int c = 0;
		while(c<g.gettabvertex().length){
			if (g.gettabvertex()[c].getNumVertex()==z){
				v1 = g.gettabvertex()[c].getNeighbours(); 	
			}
		}
		System.out.println("Les vertex auquel v1 est lié ont les identifiants suivants/n " );
		int i=0;
		while(i<v1.length){
				System.out.println(v1[i].getNumVertex());
				i++;
			}
		System.out.println("Voulez vous connaitre les voisins d'un sommet? tapez yes");
		sc4 = new Scanner(System.in);
		rep = sc4.nextLine();
		}
	}
	
}


