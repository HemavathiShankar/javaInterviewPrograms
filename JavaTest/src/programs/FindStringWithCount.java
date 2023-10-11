package programs;

public class FindStringWithCount {
    public static void main(String[] args) {
        String s="a2b3c2d1";
        char[] arr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){

            if(Character.isDigit(arr[i])){
                int n=arr[i]-'0'; //String.valueOf()   Character.getNumericValue(arr[i])

                for(int k=0;k<n;k++)
                    sb=sb.append(arr[i-1]);
            }
        }

        System.out.println(sb);
    }
}
