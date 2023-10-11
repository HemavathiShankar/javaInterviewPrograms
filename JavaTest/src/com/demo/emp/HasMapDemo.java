package com.demo.emp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HasMapDemo {

    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();

        map.put(3,"hema");
        map.put(2,"dhanu");
        map.put(1,"lakshmi");

        map.forEach((k,v)-> System.out.println(k+" "+v));


        System.out.println( map.entrySet());



    }
}
