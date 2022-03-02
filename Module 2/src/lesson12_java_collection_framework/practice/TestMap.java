package lesson12_java_collection_framework.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map <String, Integer> hashMap = new HashMap<>();
        hashMap.put("Linh", 23);
        hashMap.put("Hoang", 18);
        hashMap.put("Thuan", 17);
        hashMap.put("Dat", 21);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(23, 9.3f, true);
        linkedHashMap.put("Linh", 23);
        linkedHashMap.put("Hoang", 18);
        linkedHashMap.put("Thuan", 17);
        linkedHashMap.put("Dat", 21);
        System.out.println("\nThe age for " + "Thuan is " + linkedHashMap.get("Thuan"));
    }
}
