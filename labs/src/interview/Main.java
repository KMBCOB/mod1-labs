package interview;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // System.out.println(reverseStr("hello"));
//        for(HashMap.Entry i : countChars("banana").entrySet()) {
//            System.out.printf("%s: %d\n", i.getKey(), (int) i.getValue());
//        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);
        System.out.println(removeDupes(list));
    }

    public static String reverseStr(String input) {
        String result = "";
        for(int i = input.length() - 1; i > -1; i--) {
            result += input.substring(i, i + 1);
        }
        return result;
    }

    public static HashMap<String, Integer> countChars(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            String c = str.substring(i, i + 1);
            map.put(c, (map.containsKey(c) ? map.get(c) + 1 : 1));
        }
        return map;
    }

    public static List<Integer> removeDupes(List<Integer> ints) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: ints) {
            if (!list.contains(i)) {
                result.add(i);
                list.add(i);
            }
        }
        return result;
    }
}
