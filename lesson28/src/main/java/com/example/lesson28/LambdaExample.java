package com.example.lesson28;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface triFunction<T, A ,B, R> {
    R apply(T a , A b , B c);
}

public class LambdaExample {
    static <T> void forEach(List<T> list, Consumer<T> consumer){

        for(T elem:list) {
            consumer.accept(elem);
        }
    }
    static <T> List<T> filter (List<T> list, Predicate<T> predicate) {
        List<T> arrayList = new ArrayList<>();
        for(T elem: list) {
            if (predicate.test(elem)){
                arrayList.add(elem);
            }
        return arrayList;
        }

    }
    static <T,R> List<R> map (List<T> origin, Function<T,R> mapper ){
        List <R> arrayList = new ArrayList<>();
        for(T elem:origin ) {
            arrayList.add(mapper.apply(elem));
        }
    }

    public static void main(String[] args) {
        triFunction<Integer, Integer, Integer, Integer> triFunction = (a, b, c) -> a + b + c;
        System.out.println(triFunction.apply(1, 2, 3));
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1,2,3,4,-1,-2,-3,-4));
        ArrayList.removeIf(i-> i<0);
        ArrayList.removeIf(i-> i%2 !=0);
        arrayList =(ArrayList<Integer>) filter (arrayList,i->1%2==0);
        forEach(arrayList, elem -> System.out.println(elem));



    }

}
