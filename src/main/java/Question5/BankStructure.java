package Question5;


public class BankStructure {
    Node[] nodes = new Node[10];
    int size = 0;
    public void add(int x, int y, int percentile) {
        nodes[size++] = new Node(percentile, x, y);


//        if (size == nodes.length - 1){
//            Node[] temp = new Node[size * 2];
//            if (size >= 0) System.arraycopy(nodes, 0, temp, 0, size);
//            nodes = temp;
//        }
    }
    public int getPercentile (int pointX, int pointY) {
//        int i = 1;
        for (Node node : nodes){

            int nodeX = node.getPointX();
            int nodeY = node.getPointY();
            if ((pointX == nodeX && pointY == nodeY) || (pointY == nodeX && pointX == nodeY)){
                return node.getPercentile();
            }
        }
        return  -1;
    }

//    @Override
//    public String toString() {
//        return "BankStructure{" +
//                "nodes=" + MyArrayList.toString(nodes) +
//                ", size=" + size +
//                '}';
//    }
}