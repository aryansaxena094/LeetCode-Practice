import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        Set<Integer> s = new HashSet<Integer>();
        Collections.addAll(s, nums);
        System.out.println(s);
    }

}
