import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Graph {
    public static class GraphNode {
        public int data;
        GraphNode(int data) {
            this.data = data;
        }
    }

    class GraphWithAdjacencyList {
        private Map<GraphNode, List<GraphNode>> adjNodes;

        public void addNode(int key) {
            GraphNode newNode=new GraphNode(key);
            adjNodes.put(newNode,null);
        }

        public void removeNode(int key){
            adjNodes.remove(key);
        }

        public void addEdge(int node1,int node2) {
            
        }
    }

}
