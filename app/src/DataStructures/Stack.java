package DataStructures;

public class Stack {

    private LinkedList stack;
    private int size;
    private int maxSize;

    public Stack(){
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = Integer.MAX_VALUE;
    }

    public Stack(int maxSize){
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean hasSpace(){
        if(this.size < this.maxSize){
            return true;
        } else {
            return false;
        }
    }

    public void push(Object data){
        if(this.hasSpace()){
            this.stack.addToHead(data);
            this.size++;
            System.out.println("Added \"" + data + "\" into the stack. The size is now " + this.size);
            if(!this.hasSpace()){
                System.out.println("The stack is now full!");
            }
        }else{
            System.out.println("Attempted to push \"" + data + "\", but the stack is currently full!");
        }
    }

    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }else {
            return false;
        }
    }

    public void pop(){
        if(this.isEmpty()){
            System.out.println("Attempted to pop, but the stack is currently empty!");
        } else {
            Node removedNode = this.stack.removeHead();
            this.size--;
            System.out.println("Removed \"" + removedNode.getData() + "\" from the stack. The size is now " + this.size);
        }
    }

    public Node peek(){
        if(this.size == 0){
            System.out.println("Attempted to peek, but the stack is currently empty!");
            return null;
        }
        System.out.println("\"" + this.stack.head.getData() + "\" is at front of the queue!");
        return this.stack.head;
    }

    public static void main(String[] args) {

        Stack dirtyDishes = new Stack(2);

        dirtyDishes.push("baby's bowl");
        dirtyDishes.push("spoon");
        dirtyDishes.push("chopsticks"); // attempts to push into an already full stack - stack overflow

        dirtyDishes.peek();

        dirtyDishes.pop();
        dirtyDishes.pop();
        dirtyDishes.pop(); // attempts to pop from an empty stack - stack underflow

    }

}
