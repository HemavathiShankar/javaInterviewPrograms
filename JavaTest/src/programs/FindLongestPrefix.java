package programs;

import java.util.Arrays;

public class FindLongestPrefix
{
    public static void main(String[] args) {
        String[] arr={"abcd","abc","abcde","abcdef","shankar"};
        Arrays.sort(arr);
        for(String s:arr)
        System.out.println(s);
          int temp=0;
        for(int i=0;i<arr[0].length();i++){
           if(arr[0].charAt(i)==arr[arr.length-1].charAt(i)){
               temp=temp+1;}
               else
                   break;
        }


        if(temp>0)
            System.out.println("output  "+arr[0].substring(0,temp));
            else
            System.out.println("no prefix");





    }
}
