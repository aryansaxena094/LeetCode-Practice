import java.util.*;
public class AddBinary {
    public static void main(String[] args) {
        String a = "1010"; String b = "1011";
        System.out.println(Long.toBinaryString(Long.parseLong(a,2) + Long.parseLong(b,2)));
        
    }
}
