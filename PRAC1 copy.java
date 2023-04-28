import java.util.HashSet;

import java.util.*;

public class PRAC1 {
    public static int solution(int[] A, int[] B) {
        A = Arrays.stream(A).distinct().toArray();
        B = Arrays.stream(B).distinct().toArray();
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;

        for (int k = 0; k < n; k++) {
            int a1 = A[k];
            int b1 = B[i];
            if (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {2,3,5};
        int[] b = {0,0,0,0,0,0,0,0,0,5};
        int sol = solution(a, b);
        System.out.println(sol);
        
    }
}
