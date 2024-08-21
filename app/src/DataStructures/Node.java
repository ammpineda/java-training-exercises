package DataStructures;


public class Node {
    private Object data;
    private Node next;

    public Node(Object data){
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node node){
        this.next = node;
    }

    public Node getNextNode(){
        return this.next;
    }

    public Object getData(){
        return this.data;
    }

    public static void main(String[] args) {

        Node node1 = new Node("Apple");
        Node node2 = new Node("Banana");
        Node node3 = new Node("Orange");

        System.out.println("Node[1]: " + node1.getData());
        System.out.println("Node[2]: " + node2.getData());
        System.out.println("Node[3]: " + node3.getData());


        System.out.println();

        node1.setNextNode(node2);
        node2.setNextNode(node3);

        Node current = node1;
        System.out.println("Iterating through the linked nodes...");
        int counter = 1;
        while(current != null){
            System.out.println("[" + counter + "] " + current.getData());
            counter++;
            current = current.getNextNode();
        }

    }

}