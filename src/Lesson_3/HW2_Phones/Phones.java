package Lesson_3.HW2_Phones;

import java.util.HashMap;
import java.util.HashSet;

public class Phones {
    private static HashMap<String, HashSet<Integer>>hashMap;

    public static void main(String[] args) {
        hashMap = new HashMap<>();
        hashMap.put("Иван", new HashSet<>());
        hashMap.put("Петр", new HashSet<>());
        hashMap.put("Саша", new HashSet<>());
        hashMap.get("Иван").add(111);
        hashMap.get("Петр").add(222);
        hashMap.get("Саша").add(333);
        hashMap.get("Саша").add(444);

        add ("Саша", 555); // добавление записи

        System.out.println(hashMap);

        get("Саша"); // поиск номера
        get("Петр"); // поиск номера
    }

    private static void add(String s, int i){
        if (!hashMap.containsKey(s))
        hashMap.put(s, new HashSet<>());
        hashMap.get(s).add(i);
    }

    private static void get(String s){
        System.out.println(s+" - "+hashMap.get(s));
    }
}
