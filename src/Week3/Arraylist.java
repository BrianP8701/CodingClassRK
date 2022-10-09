package Week3;

public class Arraylist {
    public static void main(String[] args) {
        List myList = new List();
        myList.add(5);
        myList.add(6);
        myList.add(1);
        myList.add(622);
        System.out.println(myList.size());
        myList.print();
    }
}
// List Object
class List {
    // Attributes
    int[] array = new int[16];
    int size = 0;

    // Add number to end of list
    public void add(int a){
        if(size == array.length){
            increaseSize();
        }
        array[size] = a;
        size++;
    }

    /** Add a to the list at specified index **/
    public void add(int a, int index){

    }

    // Returns size
    public int size(){
        return size;
    }

    // Gets number at specified index
    public int get(int index){
        return array[index];
    }

    // Prints the arraylist
    public void print(){
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    // Doubles the size of the array, and copies old array over
    public void increaseSize(){
        int[] newArray = new int[array.length * 2];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
