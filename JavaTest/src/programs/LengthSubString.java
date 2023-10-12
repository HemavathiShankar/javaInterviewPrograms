package programs;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LengthSubString {
    public static void main(String[] args) {
        //abcdeab => 4
        //ength is 4(abcd)
        System.out.println("this program is used to fing longest substring");
        String s="feabcdeabc";
        /*StringBuilder sb=new StringBuilder();
        char[] arr=s.toCharArray();

        for(int i=0;i<s.length();i++){
            boolean count=false;
            for(int j=i+1;j<s.length();j++) {
                if (arr[i] == arr[j]) {
                    count = true;

                }}
                if (!count)
                    sb.append(arr[i]);
            }*/
        Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .filter((n->n.getValue()==1)).forEach(k-> System.out.println(k));

        //System.out.println(sb+" "+sb.length());

    }}

