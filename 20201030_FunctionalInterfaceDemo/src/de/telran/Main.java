package de.telran;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        LengthCounter lc = new LengthCounter() {
            @Override
            public int count(String s) {
                return s.length();
            }
        };

        LengthCounter lc1 = someName -> {
            System.out.println(someName);
            return someName.length()/2;
        };

        LengthCounter lc2 = s -> s.length() +3;

        System.out.println(lc.count("hello"));
        System.out.println(lc1.count("vasya"));

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  ((Integer)o1.length()).compareTo(o2.length());  //o1.length()- o2.length();
            }
        };

        Comparator<String> comparator1 = (s1,s2)-> ((Integer)s1.length()).compareTo(s2.length());
        Comparator<Person> personComparator = (p1,p2) -> Integer.compare(p1.getAge(),p2.getAge());
        Comparator<Person> personComparatorByName = (p1,p2) -> p1.getName().compareTo(p2.getName());

        System.out.println(comparator1.compare("abbcd", "sgh"));

        Predicate p = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };

        Predicate<String> p1 = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return string.length()>0;
            }
        };

        Predicate<Integer> p2 = integer -> integer>0;
        System.out.println(p2.test(-10));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        Predicate<Integer> p3 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        sumAll(numbers, integer -> true);
        sumAll(numbers, integer -> integer%2==0);
        sumAll(numbers, integer -> integer>3);

        Function<String, Integer> f = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return string.length();
            }
        };

        Function<String,String> f1 = s -> s.toUpperCase();  // String::toUpperCase
        System.out.println("! " + f1.apply("hello") + " !");

        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };

        /*System.out.println(numbers);
        for (int num:numbers) {
            System.out.println(num);
        }*/

        Consumer<Integer> c = System.out::println;
        numbers.forEach(c);

        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return null;
            }
        };

        Supplier<String> s = ()->"Solut!";
        System.out.println(s.get());

        Supplier<LocalDate> supplier1 = ()->LocalDate.now();  //LocalDate::now;

        System.out.println(supplier1.get());

        Supplier<LocalDate> supplier2 = ()->LocalDate.now().minusDays(1);
        System.out.println(supplier2.get());

        BiFunction biFunction = new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return null;
            }
        };

        BiFunction<String,Integer,Person> bf= Person::new;

        Person person = bf.apply("Anna",25);

        UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return null;
            }
        };

        UnaryOperator<Integer> square = x->x*x;
        System.out.println(square.apply(5));

        BinaryOperator binaryOperator = new BinaryOperator() {
            @Override
            public Object apply(Object o, Object o2) {
                return null;
            }
        };

        BinaryOperator<Integer> multiply = (x,y)->x*y;
        System.out.println(multiply.apply(5,4));
        System.out.println(multiply.andThen(square).apply(2, 3));


    }

    public static int sumAll(List<Integer> numbers, Predicate<Integer> p){
        int sum = 0;
        for (int num:numbers) {
            if(p.test(num))
            sum +=num;
        }
        return sum;
    }


}
