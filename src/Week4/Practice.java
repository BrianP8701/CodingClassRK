package Week4;

import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {

    }

    public static boolean canMap(String a, String b){
        HashMap<Character, Character> map = new HashMap<>();
        if(a.length() != b.length()) return false;
        for(int i = 0; i < a.length(); i++){
            if(map.containsKey(a.charAt(i))){
                if(b.charAt(i) != map.get(a.charAt(i))) return false;
            }
        }
        return true;
    }

    public static int[] findMatch(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(target - arr[i])){
                return new int[] {map.get(target - arr[i]), i};
            }
            map.put(arr[i], i);
        }
        return null;
    }
}
