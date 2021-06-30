import java.util.*;

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
            List<GraphNode> addNode = new ArrayList<GraphNode>();
            if(adjNodes.containsKey(node1)){
                addNode=adjNodes.get(node1);
                addNode.add(new GraphNode(node2));
            }
            if(adjNodes.containsKey(node2)){
                addNode=adjNodes.get(node2);
                addNode.add(new GraphNode(node1));
            }
        }

        public void removeEdge(int node1,int node2) {
            adjNodes.get(node1).remove(node2);
            adjNodes.get(node2).remove(node1);
        }

        public List<GraphNode> getAdjNodes(int key) {
            List<GraphNode> result = new ArrayList<GraphNode>();
            result=adjNodes.get(key);
            return result;
        }

        // driver (this is the method called from any application
        public void dfs() {
            boolean[] visited = new boolean[adjNodes.size()];
            for (int v=0; v < visited.length; v++) {
                visited[v] = false;
            }
            for (int v=0; v < visited.length; v++) {
                if (!visited[v]) { // start/restart at v
                    dfs(v, visited);
                }
            }
        }
        // recursive dfs
        private void dfs(int v, boolean[] visited) {
            visited[v] = true;
            // driver (this is the method called from any application
            adjNodes.forEach((String key, Object value)->{
                        // if you want to use key, just call key

                        // checks if the value (Object) from the map is a list
                        if(value instanceof List){
                            List l = (List)value;
                            // loop through the list
//                            l.forEach((GraphNode item)->{
//                                // Do something with the item from the list
//                                if (!visited[item.data]) {
//                                    dfs(item.data, visited);
//                                }
//                            });
                            for (int i = 0; i < l.size(); i++) {
                                if (!visited[l.get(i)) {
                                    dfs(l.get(i),visited);
                                }
                            }
                        }
                    });
        }

        public void bfs(int v) {
            boolean visited[]=new boolean[v];
            Queue<Integer> q = new LinkedList<>();
            visited[v]=true;
            q.add(v);
            adjNodes.forEach((String key, Object value)->{
                // if you want to use key, just call key

                // checks if the value (Object) from the map is a list
                if(value instanceof List){
                    List l = (List)value;
                    // loop through the list
//                            l.forEach((GraphNode item)->{
//                                // Do something with the item from the list
//                                if (!visited[item.data]) {
//                                    dfs(item.data, visited);
//                                }
//                            });
                    for (int i = 0; i < l.size(); i++) {
                        if (!visited[l.get(i)) {
                            visited[l.get(i)]=true;
                            q.add(l.get(i));
                        }
                    }
                }
            });
        }

        public int minNumberOfEdges(int u,int v) {
            Queue<Integer> q = new LinkedList<>();
            int [] parentArray=new int[adjNodes.size()];
            int [] visited=new int[adjNodes.size()];
            q.add(u);
            visited[u]=1;
            int removedNumber=-1;
            List<GraphNode> temp;
            for(int i=0;i<parentArray.length;i++) {
                parentArray[i]=-1;
            }
            while(!q.isEmpty()) {
                removedNumber=q.remove();
                temp=getAdjNodes(removedNumber);
                for(int i=0;i<temp.size();i++) {
                    if(visited[temp.get(i).data]==0) {
                        q.add(temp.get(i).data);
                        parentArray[temp.get(i).data]=removedNumber;
                    }
                }
            }
            int j=v;
            int count=0;
            while(parentArray[j]!=-1){
                count++;
                j=parentArray[j];
            }
            return count;
        }

    }

}
