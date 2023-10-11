package com.demo.emp;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringNonRepeating {

    public static void main(String[] args) {

        //s="eawejhgjgyuiokkklhojljio"First character which is not repeating

       /* String s="eawejhgjgyuiokkklhojljio";

       String temp= Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(n->n.getValue()==1).map(k->k.getKey()).findFirst().orElse(null);

        System.out.println("first non repeating character "+temp);


        */
       /* String s="eawejhgjgyuiokkklhojljio";
        Map<Character,Integer> map=new HashMap<>();

        char[] arr=s.toCharArray();

        for(int i=0;i<s.length();i++){

            if(map.containsKey(arr[i])){

                map.put(arr[i],map.get(arr[i])+1);

            }

            else{
                map.put(arr[i],1);
            //System.out.println(arr[i]);
        }}

       // System.out.println(map.get());

       // Iterator it1=map.entrySet();
        while(it1.hasNext()){

            System.out.println();
        }

        System.out.println(map);
*/






    }}







