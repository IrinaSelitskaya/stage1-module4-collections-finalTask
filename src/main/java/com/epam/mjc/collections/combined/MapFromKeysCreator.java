package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            Set<String>set=new HashSet<>();
            String s = entry.getKey();
            int x = s.length();
            set.add(s);
            if (!map.containsKey(x)) {
                map.put(x, set);
            }else {

                Set<String>set1=new HashSet<>(map.get(x));
                set1.addAll(set);
                map.put(x,set1);
            }
        }
        return map;
    }
}
