package de.telran;

import java.util.function.Function;
import java.util.function.Predicate;

public class TransformWithFunctionalInterface {
    public static void main(String[] args) {
        String str = "aa RtUf fgH RTYHJ";
        Predicate<String> lengthIsThree = string -> string.length()==3;
        Predicate<Integer> moreThanTen = integer -> integer>10;
        Predicate<Person> oldestThanTen = person -> person.getAge()>10;

        System.out.println(moreThanTen.test(5));
        System.out.println(lengthIsThree.test("hello"));
        System.out.println(oldestThanTen.test(new Person("Vasya", 15)));

        Function<String, String> f = string -> string.replaceAll(".","*");
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(transform(str, s -> s.length() % 2 == 0, String::toUpperCase));

    }

    private static String transform(String input, Predicate<String> p, Function<String,String> f){
        String[] words = input.split(" ");
        for (int i = 0; i <words.length ; i++) {
            if(p.test(words[i])){
                words[i] = f.apply(words[i]);
            }
        }
        return String.join(" ", words);
    }

}
