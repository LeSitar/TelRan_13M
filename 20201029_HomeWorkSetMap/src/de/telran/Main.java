package de.telran;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*System.out.println(removeDuplicate(Arrays.asList(1,2,3,5,5,6,7,8,1)));
        System.out.println(getDuplicate(Arrays.asList(1,1,2,3,3,4)));
        String[] strings = {"a","a","b","c","d","d"};
        System.out.println(wordMultiple(strings));*/

        String[] strings1 = {"ivan", "vani", "anna", "naan", "piotr", "navi"};
        Anagram anagram = new Anagram(strings1);
        anagram.createMap();
        System.out.println(anagram.getMap());
        List<String> ivan = anagram.getAnagrams("ivan");
        System.out.println(ivan);


    }

    private static <E> List<E> removeDuplicate(List<E> list){
        Set<E> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    private static <E> List<E> getDuplicate(List<E> list){
        Set<E> set = new HashSet<>();
        List<E> duplicateString = new ArrayList<>();
        for (E s:list) {
           if(!set.add(s)){
               duplicateString.add(s);
           }
        }
        return duplicateString;
    }

    private static Map<String,String> getNewMapWithNewKey(Map<String,String> map, String a, String b){
        Map<String,String> newMap = new HashMap<>(map);
        if(newMap.containsKey(a)&&newMap.containsKey(b)){
            newMap.put((a+b), newMap.get(a) + newMap.get(b));
        }
        return newMap;
    }

    private static Map<String,Boolean> wordMultiple (String[] strings){  // a,a,f,c,d,d,
        Map<String, Boolean> map = new HashMap<>();
        for (String s:strings) {
            map.put(s,map.containsKey(s));
        }
        return map;
    }

    private static Map<String,Boolean> wordMultiple1 (String[] strings){
        Map<String, Boolean> map = new HashMap<>();
        int count;
        List<String> list = Arrays.asList(strings);
        for (String s:strings) {
            count = Collections.frequency(list,s);
            map.put(s,count>1);
        }
        return map;
    }








}
