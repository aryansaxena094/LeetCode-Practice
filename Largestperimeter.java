import java.util.*;
public class Largestperimeter {
    public static void main(String[] args) {
        int nums[] = {2,1,2};
        Arrays.sort(nums);
        int ans = 0;
        if(nums[2] != nums[1]*nums[1] + nums[0]*nums[0])
        {
            ans = nums[0]+nums[1]+nums[2];
        }
        System.out.println(ans);   
    }
}
