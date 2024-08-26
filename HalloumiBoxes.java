import java.util.*;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (k == 1 && !isSorted(arr, n)) System.out.println("No");
        else System.out.println("Yes");
        }
        sc.close();
    }

    private static boolean isSorted(int[] arr, int n) {
        if (n == 0 || n == 1) return true;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) return false;
        }
        return true;
    }
}
