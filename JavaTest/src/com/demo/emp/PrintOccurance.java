package com.demo.emp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintOccurance {

   static char temp;


    public static void main(String[] args) {

        //nput is a string like "AAAAABBCCAA" and it should print "5A2B2C2A".
        // 5 being the continuous number of occurrence for character 'A'. Same is with other characters also.

        String s="AAAAABBCCAADEEF";
        char[] arr=s.toCharArray();
        StringBuilder stb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(arr[i]==arr[j] && arr[i]!='0'){
                    count++;
                    arr[j]='0';
                }
            else {

                    break;
                }

            }
            if(count>=1 && arr[i]!='0'){

                stb.append(count).append(arr[i]);
            }

        }

        System.out.println(stb.toString());
        }
    }