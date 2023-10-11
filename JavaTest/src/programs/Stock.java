package programs;

public class Stock {

    public static void main(String[] args) {

       // input: prices = [7,1,5,3,6,4]
      //  Output: 5
      //  Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
      //  Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

        int[] arr={7,1,5,3,6,4};
        int diff=0;
        int temp=-1;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {

                diff = maxdif(arr[i], arr[j]);

                if (diff < temp && diff<0)
                    temp = diff;

            }

        }

        System.out.println(Math.abs(temp));


    }

    public static int maxdif(int num1,int num2){

    int diff=num1-num2;

    return diff;




    }


}
