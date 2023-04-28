import java.util.*;

public class ContainsDuplicated {
    public static void main(String[] Args){
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        Arrays.sort(nums);
        boolean ans = false;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i-1] == nums[i])
            {
                ans = true;
                break;
            }
        }
        System.out.println(ans);
    }
}
