package ulitiy;

public class DoublyLinkedList<T>{
    public class Node{
        public T Data;
        public Node next;
        public Node prev;
        public Node(T Data){
            this.Data = Data;
        }

    }
    private Node head;
    private Node tail;
    private int size;
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        size = 0;
    }

    //add method
    public void addFirst(T data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;//the head is the first
        }else {
            newNode.next = head;
            head.prev = newNode;//change the newNode to head
        }
        head = newNode;//the newNode become the new head
        size ++;
    }
    public void addLast(T data){
        Node newNode = new Node(data);
        if (tail == null){
            tail = newNode;//the last is the tail
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;//change tailNode to tailPrevNode
        }
        tail = newNode;//the newNode become the new tail
        size ++;
    }

    //remove method
    public void removeFirst(){
        if (head==null){
            tail=null;//didn't find
        }else if (tail.prev==head.next){
            head = null;
            tail = null;
            size --;//only one
        }else {
            head.next.prev = null;
            head = head.next;//skip the node to remove it
            size--;
        }
    }
    public void removeLast(){
        if (head == null){
            tail=null;//didn't find
        }else if (tail.prev == head.next){
            head = null;
            tail = null;
            size --;//remove the only one
        }else{
            tail.prev.next = null;
            tail = tail.prev;
            size --;// let the tailNode to its prevNode, and make the new tail.next point to null
        }
    }

    // specific method
    public Node getSpecific(int index){
        Node current = head;
        if (head == null) {
            throw new IllegalStateException("The list is empty.");
        }
        for(int i = 0 ;i < index ; i++){
            current = current.next;
        }//use the index to get the node
        return current;
    }

    public T getData(int index) {
        if (index < size){
            return null;
        }else {
            return getSpecific(index).Data;
        }
    }

    public void removeSpecific(int index){
        Node current = getSpecific(index);
        if (current == null){
            return;
        }else {
            current.prev.next = current.next;
            current.next.prev = current.prev;//skip the node to remove the node
        }
        size --;
    }

    public void iterateForward(){
        while (head != null){
            System.out.print(head.Data);
            head = head.next;// from head to tail
        }
        System.out.println("null");
    }

    public void iterateBackward(){
        while (tail != null){
            System.out.print(tail.Data);
            tail = tail.prev;//from tail to head
        }
        System.out.println("null");
    }

    public int size() {
        return size;
    }


}
