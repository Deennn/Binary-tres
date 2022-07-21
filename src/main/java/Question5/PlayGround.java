package Question5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlayGround {
    private final String fileLocation;
    private final MyArrayList<MyArrayList<Integer>> list = new MyArrayList<>();
    private BankStructure BankStructure = null;
    private int vertex = 0;
    public PlayGround(String fileLocation)  {
        this.fileLocation = fileLocation;
    }



    public void setUpFromFile(){
        String line;
        boolean first = true;
        try (FileReader fileReader = new FileReader(fileLocation);
             BufferedReader bufferedReader = new BufferedReader(fileReader))  {
            while((line = bufferedReader.readLine()) != null){
                if (first){
                    vertex = Integer.parseInt(line);
                    BankStructure = new BankStructure();
                    first = false;
                    for (int i = 0; i < vertex; i++) {
                        list.add(new MyArrayList<>());
                    }
                } else {
                    String [] arr = line.split(",");
                    int x = Integer.parseInt(arr[0]) - 1;
                    int y = Integer.parseInt(arr[1]) - 1;
                    int percentile = Integer.parseInt(arr[2]);
                    BankStructure.add(x, y, percentile);
                    addEdge(x, y);


                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    private void addEdge(int x, int y) {
        list.get(x).add(y);
        list.get(y).add(x);
    }


    public double shortestPath(int a, int b) {

        int source = a - 1;
        int dest = b - 1;
        int [] pred = new int[vertex];
        int [] dist = new int[vertex];
        if (!search(list, source, dest, pred, dist)) {
            return 0;
        }

        SinglyLinkedList path = new SinglyLinkedList();
        int crawl = dest;
        path.add(crawl);
        while (pred[crawl] != -1) {
            path.add(pred[crawl]);
            crawl = pred[crawl];
        }
        BigDecimal solution = BigDecimal.ONE;
        for (int i = path.size() - 1; i > 0; i--) {
            double percentage = BankStructure.getPercentile(path.get(i), path.get(i-1));
            BigDecimal num1 = BigDecimal.valueOf(percentage);
            BigDecimal num2 = BigDecimal.valueOf(100);
            solution = solution.multiply(num1.divide(num2, 100,  RoundingMode.HALF_UP));
        }
        return solution.doubleValue();
    }



    private boolean search(MyArrayList<MyArrayList<Integer>> adj, int source,
                           int destination, int[] predestination, int[] dist) {


        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        boolean[] visited = new boolean[vertex];
        for (int i = 0; i < vertex; i++) {
            dist[i] = Integer.MAX_VALUE;
            predestination[i] = -1;
        }
        visited[source] = true;
        dist[source] = 0;
        singlyLinkedList.add(source);

        while (!singlyLinkedList.isEmpty()) {
            int unknown = singlyLinkedList.remove();
            for (int i = 0; i < adj.get(unknown).size(); i++) {
                if (!visited[adj.get(unknown).get(i)]) {
                    visited[adj.get(unknown).get(i)] = true;
                    dist[adj.get(unknown).get(i)] = dist[unknown] + 1;
                    predestination[adj.get(unknown).get(i)] = unknown;
                    singlyLinkedList.add(adj.get(unknown).get(i));
                    if (adj.get(unknown).get(i) == destination)
                        return true;
                }
            }
        }
        return false;
    }

}