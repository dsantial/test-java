package chapter11;

import java.util.*;

/**
 * Created by 390767 on 17-5-11.
 */
public class PrintingContainers {
    static Collection fill(Collection<String> colection){
        colection.add("rat");
        colection.add("cat");
        colection.add("dog");
        colection.add("dog");
        return colection;
    }
    static  Map fill(Map<String,String> map){
        map.put("rat","Fuzzy");
        map.put("cat","Rage");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }
    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));

    }
}
