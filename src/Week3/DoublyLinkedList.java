package Week3;

public class DoublyLinkedList {
    public static void main(String[] args) {

    }
}
class DoublyLinkedlist{
    // Attributes
    DoubleNode head;
    DoubleNode tail;
    int size = 0;

    // Add number to end of list
    public void add(int a){
        if(size == 0) {
            head = new DoubleNode(a, null, null);
            tail = head;
        } else {
            tail.next = new DoubleNode(a, null, tail);
            tail = tail.next;
        }
        size++;
    }

    /** Return last number of list **/
    public void remove(){

    }

    /** Remove number at specified **/
    public void remove(int a){

    }

    /** Return index of the specified number in the list **/
    public int search(int a) {
        return 1;
    }

    /** Return a copy of this doubly linked list data structure **/
    public DoublyLinkedlist copy(int a) {
        return null;
    }

    public int size(){
        return size;
    }
}

class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;

    DoubleNode(int data, DoubleNode next, DoubleNode prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

}