class Main {
  public static void main(String[] args) {
    String[] vertices = {
      "Liberal Arts", 
      "Student Services", 
      "Health Careers & Sciences", 
      "Health Technologies Center", 
      "Recreation Center", 
      "Technology Learning Center", 
      "Business & Technology", 
      "Theatre"
    };

    int[][] edges = {
      {0, 1}, 
      {1, 2}, 
      {2, 3}, 
      {1, 5}, 
      {5, 6}, 
      {6, 7}, 
      {6, 4}, 
      {2, 4}  
    };

    Graph<String> graph = new UnweightedGraph<>(vertices, edges);
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(graph.getIndex("Business & Technology"));
    
    java.util.List<Integer> searchOrders = dfs.getSearchOrder();
    System.out.println(dfs.getNumberOfVerticesFound() + " vertices are searched in this DFS order:");
    for (int i = 0; i < searchOrders.size(); i++)
      System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
    System.out.println();

    System.out.println();
    dfs.printPath(graph.getIndex("Health Technologies Center"));
    System.out.println();
    dfs.printPath(graph.getIndex("Student Services"));
    System.out.println();
    dfs.printPath(graph.getIndex("Recreation Center"));
    System.out.println();

    dfs.printTree();
  }
}
