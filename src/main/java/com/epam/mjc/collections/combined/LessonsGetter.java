package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String>set=new HashSet<>();
        List<List<String>>arrayList=new ArrayList<>(timetable.values());
        for (List<String>list:arrayList){
            for (int i=0;i<= list.size();i++){
                set.add(list.get(i));
            }
        }
return set;
    }
}
