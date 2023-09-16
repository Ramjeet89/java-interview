package com.interview.utils.shallow_deep_copy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CloneDeep implements Cloneable {

    private String name;
    private Map<Integer, Integer> map;

    public CloneDeep(String name, Map<Integer, Integer> map) {
        this.name = name;
        this.map = map;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Deep copy doing");
        Map<Integer, Integer> map = new HashMap<>();
        Iterator<Integer> itr = this.map.keySet().iterator();
        while (itr.hasNext()) {
            Integer key = itr.next();
            map.put(key, this.map.get(key));
        }
        CloneDeep cloneDetailedDeep = new CloneDeep(new String("name"), map);
        return cloneDetailedDeep;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(11, 11);
        CloneDeep obj1 = new CloneDeep("Ankit", map);
        CloneDeep obj2 = (CloneDeep) obj1.clone();

        System.out.println(obj1 == obj2);
        System.out.println(obj1.name == obj2.name);
        System.out.println(obj1.map == obj2.map);

    }
}
