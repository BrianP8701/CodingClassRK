package Week3;

public class LinkedList {
    public static void main(String[] args) {

    }
}

class Linkedlist{
    Node head;
    Node tail;
    int size = 0;

    // Add number to end of the list
    public void add(int a){
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

class Node {
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

}
