package org.sephora.day1.dataStructures;

import java.util.HashMap;
import java.util.Map;

public class MapDS {
    public static void main(String[] args) {
        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        System.out.println("\nMap Example:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
