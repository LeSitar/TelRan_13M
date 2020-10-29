package de.telran;

import java.util.*;

public class Anagram {
    private String[] voc;
    private Map<String, List<String>> map;

    public Anagram(String[] voc) {
        this.voc = voc;
        map = new HashMap<>();
    }

    //{ivan, vani, anna, naan, piotr, navi}


    public Map<String, List<String>> getMap() {
        return map;
    }

    //ivan

    private static String sortWord(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }

    public void createMap(){
        for (String v:voc) {
            String key = sortWord(v);
            if(!map.containsKey(key)){
                List<String> anagrams = new ArrayList<>();
                anagrams.add(v);
                map.put(key,anagrams);
            }else{
                List<String> anagramsList = map.get(key);
                anagramsList.add(v);
            }
        }
    }

    public List<String> getAnagrams(String word){
        String key = sortWord(word);
        return map.get(key);
    }
}
