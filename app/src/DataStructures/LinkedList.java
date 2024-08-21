package DataStructures;

public class LinkedList {
    public Node head;

    public LinkedList(){
        this.head = null;
    }

    public void addToHead(Object data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node currentHead = this.head;
            this.head = new Node(data);
            this.head.setNextNode(currentHead);
        }

    }

    public void addToTail(Object data) {
        Node currentNode = this.head;
        if(currentNode == null){
            this.head = new Node(data);
        } else{
            while(currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(new Node(data));
        }
    }

    public Node removeHead() {
        if(this.head == null){
            System.out.println("Cannot remove head because the list is currently empty.");
            return null;
        } else {
            Node oldHead = this.head;
            this.head = this.head.getNextNode();
            return oldHead;
        }
    }

    public void printList(){
        String output = "<head> ";
        Node currentNode = this.head;
        while(currentNode != null){
            output = output + currentNode.getData() + " ";
            currentNode = currentNode.getNextNode();
        }
        output = output + "<tail>";
        System.out.println(output);
    }

    public static void main(String[] args) {

        LinkedList listOfFavoriteGames = new LinkedList();

        listOfFavoriteGames.addToHead("Hunger Games");
        listOfFavoriteGames.addToTail("Divergent");
        listOfFavoriteGames.addToTail("Dune");
        listOfFavoriteGames.addToHead("Mad Max");

        listOfFavoriteGames.removeHead();

        listOfFavoriteGames.printList();

    }

}
