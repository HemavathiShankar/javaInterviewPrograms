package com.demo.emp;

///list={1,2,2,1,3,4,2,3,4,4,4,4}
//find top 2 repeated number


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,2,1,3,4,2,3,4,4,4,4);

        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .sorted((o1,o2)->o2.getValue()>o1.getValue()?1:-1).limit(2).map(k->k.getKey()).forEach(n-> System.out.println(n));
    }
}
