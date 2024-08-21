package DataStructures;

public class Queue {
    private LinkedList queue;
    private int size;
    private int maxSize;

    public Queue(){
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = Integer.MAX_VALUE;
    }

    public Queue(int maxSize){
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean hasSpace(){
        if(this.size < this.maxSize){
            return true;
        } else if (this.size >= this.maxSize){
            return false;
        }
        return false;
    }

    public void enqueue(Object data){
        if(this.hasSpace()){
            this.queue.addToTail(data);
            this.size++;
            System.out.println("Added \"" + data + "\" into the queue. The size is now " + this.size);
            if(!this.hasSpace()){
                System.out.println("The queue is now full!");
            }
        }else{
            System.out.println("Attempted to enqueue \"" + data + "\", but the queue is currently full!");
        }
    }

    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        } else if (this.size > 0){
            return false;
        }
        return false;
    }

    public void dequeue(){
        if(this.isEmpty()){
            System.out.println("Attempted to dequeue, but the queue is currently empty!");
        } else {
            Node removedNode = this.queue.removeHead();
            this.size--;
            System.out.println("Removed \"" + removedNode.getData() + "\" from the queue. The size is now " + this.size);
        }
    }

    public Node peek(){
        if(this.size == 0){
            System.out.println("Attempted to peek, but the queue is currently empty!");
            return null;
        }
        System.out.println("\"" + this.queue.head.getData() + "\" is at front of the queue!");
        return this.queue.head;
    }


    // MAIN FUNCTION
    public static void main(String[] args) {

        Queue line = new Queue(2); // bounded queue

        line.enqueue("study Math");
        line.enqueue("cook Dinner");
        line.enqueue("walk Dog");

        line.peek();

        line.dequeue();
        line.dequeue();
        line.dequeue();

        line.peek();

    }
}
