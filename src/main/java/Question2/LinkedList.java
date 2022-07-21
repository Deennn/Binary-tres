package Question2;

public class LinkedList {

     Node head;
     private int size;

   public static class Node<T> {
       private T data;
       private Node next;

       public Node(T data) {
           this.data = data;
           this.next = null;
       }

       @Override
       public String toString() {
           return "Node{" +
                   "data=" + data +
                   ", next=" + next +
                   '}';
       }
   }

   public void add(Meal meal){
       Node node = new Node<>(meal);
       node.next = head;
       head = node;
       size++;
   }

   public int find(Node head, Meal meal) {
       if (head == null) return -1;
       Node current = head;
       while (current != null) {
           if (current.data.equals(meal)) {
               return 1;
           }
           current = current.next;
       }
       return -1;
   }

   public int size() {
       return size;
   }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
