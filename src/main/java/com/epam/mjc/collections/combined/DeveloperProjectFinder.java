package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String>list=new ArrayList<>();
        for (Map.Entry<String,Set<String>>entry: projects.entrySet()){
            Set<String>set=entry.getValue();
            if(set.contains(developer)){
                list.add(entry.getKey());
            }
        }
            list.sort(new ListComparator().reversed());
        return list;
    }
}
class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x=Integer.compare(a.length(), b.length());
        return (x!=0?x:a.compareTo(b));
    }
}