import java.util.*;

public class MajorityElement {
    public static void main(String[] Args)
    {
        int nums[] = {6,6,6,7,7};
        Arrays.sort(nums);
        int maxcount = 0;
        int count = 0;
        int ans = 0;
        if(nums.length>1){
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                count++;
                
                if(maxcount<count)
                {
                    maxcount = count;
                    ans = nums[i];
                }
            }
            else
            {
                count = 0;
            }
        }
        }
        else
        {
            ans = nums[0];
        }
        System.out.println(ans);
    }
}
