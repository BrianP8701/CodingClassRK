package Week4;

public class LinkedList {
    public static void main(String[] args) {

        Linkedlist myList = new Linkedlist();
        myList.add("Hello");
        myList.add(5);


    }
}

class Linkedlist<T>{
    Node head;
    Node tail;
    int size = 0;

    // Add number to end of the list
    public void add(T a){
        if(size == 0) {
            head = new Node(a, null);
            tail = head;
        } else {
            tail.next = new Node(a, null);
            tail = tail.next;
        }
        size++;
    }

    /** Return number at end of the list **/
    public void remove(){

    }

    /** Return number at specified index **/
    public void remove(int a){

    }

    public int size(){
        return size;
    }
}

class Node<T> {
    // Attributes
    T data;
    Node next;

    // Constructor
    Node(T data, Node next){
        this.data = data;
        this.next = next;
    }

}
