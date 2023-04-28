import java.util.*;

public class sqrt {

    public static void sq(int x, ArrayList<Integer> nums)
    {
        for(int i = 2; i <= x; i++)
        {
            if(x%i==0)
            {
                x = x/i;
                nums.add(i);
                sq(x,nums);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int ans = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        sq(x,nums);
        System.out.println(nums);
    }
    
}
