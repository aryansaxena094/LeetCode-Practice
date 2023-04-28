import java.util.*;

public class BuySellStock {
    public static void main(String[] Args){
        int prices[] = {7,1,5,3,6,4};
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < min) min = prices[i];
            if(max < prices[i] - min)
            {
                max = prices[i] - min;
            }
        }
        System.out.println(max);

    }
}
