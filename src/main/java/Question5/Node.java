package Question5;

public class Node {
    private final int percentile;
    private final int pointX;
    private final int pointY;

    public Node(int percentile, int pointX, int pointY) {
        this.percentile = percentile;
        this.pointX = pointX;
        this.pointY = pointY;
    }
    public int getPercentile() {
        return percentile;
    }
    public int getPointX() {
        return pointX;
    }
    public int getPointY() {
        return pointY;
    }

    @Override
    public String toString() {
        return "Node{" +
                "percentile=" + percentile +
                ", pointX=" + pointX +
                ", pointY=" + pointY +
                '}';
    }
}