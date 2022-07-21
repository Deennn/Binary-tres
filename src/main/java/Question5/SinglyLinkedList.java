package Question5;

public class SinglyLinkedList {
    Node head;
    int size = 0;

    public void add(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public int remove (){
     int val = head.data;
     head = head.next;
     size--;
     return val;
    }

    public int get (int index){
        Node curr = head;
         for (int i = 0; i< index; i++) {
             curr = curr.next;
         }

        return curr.data;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int size(){
        return size;
    }

    static class Node {
        int data;
        Node next;
        Node(int val){
            this.data = val;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "HEAD=" + head +
                ", size=" + size +
                '}';
    }
}
