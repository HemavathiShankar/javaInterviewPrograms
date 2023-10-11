package programs;

public class reverseString {
    public static void main(String[] args) {
        String s="hemashankar";
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=n-1;i>0;i--)
        {
           sb.append(s.charAt(i));
        }
        String s1=sb.toString();
        System.out.println(s1);


    }
}
