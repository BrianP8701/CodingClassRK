package Week4;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {

        //       Key     Value
        HashMap<String, Integer> store = new HashMap();

        // We have a store
        // Banana 10
        // Apple 5
        // Water 1

        store.put("Banana", 2);
        store.put("Apple", 5);
        store.put("Water", 1);

        store.put("Banana", 10);
        if(store.containsKey("Cheetos")){

        }

        System.out.println( store.get("Water") );

    }
}
