
import java.util.*;
public class Main {
    public void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }

        while (j >= 0) {
            A[k--] = B[j--];
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 0, 0, 0};
        int[] B = {2, 5, 6};
        int m = 3;
        int n = 3;

        Main merger = new Main();
        merger.merge(A, m, B, n);

        System.out.println(Arrays.toString(A));
    }
}
