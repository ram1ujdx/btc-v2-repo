package graph;

public class MainClass {

	public static void main(String[] args) {
		
		Graph graph=new Graph(5);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 4);
		graph.addEdge(1, 2);
		graph.addEdge(2,3);
		graph.addEdge(3, 1);
		graph.addEdge(4, 0);
		
		graph.getAdj(0).forEach(System.out::println);

	}

}
