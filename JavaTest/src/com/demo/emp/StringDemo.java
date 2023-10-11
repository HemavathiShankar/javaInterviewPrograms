package com.demo.emp;

//input hema@gmail.com
//output: h**a@g***l.com

import java.util.Arrays;

public class StringDemo {

    public static void main(String[] args) {
       String s="hemavathi";

       char[] arr=s.toCharArray();
      // StringBuilder sb=new StringBuilder();
        int n=s.length()/2;


       for(int i=0;i<n;i++)
       {
          // swap(arr[i],arr[arr.length-1-i]);
           char temp=arr[i];
           arr[i]=arr[arr.length-1-i];
           arr[arr.length-1-i]=temp;

           System.out.println(arr);
       }
       for(char c:arr)
           System.out.println(c);
       /*
       for(int k=0;k<arr.length;k++) {
           Arrays.stream(s.split("")).map(n -> n.replace("arr[k]","arr[arr.length-1-k]")).
                   forEach(j-> System.out.println(j));*/

       }
    }

    /*private static void swap(char c, char c1) {

        char temp=c;
        c=c1;
        c1=c;
    }*/

