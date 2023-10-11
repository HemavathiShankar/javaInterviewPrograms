package com.demo.emp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        //most coomom word in list of string

        //strings=hema,hema,vani,vani,vani;

        //return first occurance

       // List<String> list= Arrays.asList("hema","hema","vani","vani","vani");

       // list.stream().collect(groupBy(Funtion.identity(), Collectors.counting()).entry.set().sorted())

        int[] arr={2,4,5,1,2};

        sortarr(arr);

    }

    private static void sortarr(int[] arr) {

        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length-i-1;j++)
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[j]=arr[i];
                    arr[i]=arr[j];
                }

        for(int i:arr)
            System.out.println(i);


    }


}
