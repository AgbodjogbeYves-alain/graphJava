import java.util.Scanner;

public class TestImpl {
	public static void main() {
		Graphe g = new graphImplementation();
		System.out.println("Entrez un identifiant(int) pour le vertex 1");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Vertex v1 = new Vertex(x,null);
		System.out.println("Entrez un identifiant(int) pour le vertex 2");
		Scanner sc2 = new Scanner(System.in);
		int y = sc2.nextInt();
		Vertex v2 = new Vertex(y,null);
		g.addVertex(v1);
		g.addVertex(v2);
		g.addEdge(v1, v2);
		System.out.println("Entrez 1 pour avoir les voisins de v1 ou 2 pour avoir les voisins de v2");
		Scanner sc3 = new Scanner(System.in);
		int z = sc3.nextInt();
		if (z == 1){
			v1.getNeighbours();
		}
		else 
		{
			v2.getNeighbours();
		}
		}
		
	}

