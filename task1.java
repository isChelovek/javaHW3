import java.util.Arrays;

// 1) Реализовать алгоритм сортировки слиянием
public class task1 {

    public static void main(String[] args) {
        int[] a1 = new int[] {57, 4, 7, 5, 8, 24, 40};
        merge(a1,0,6);
        for (int i = 0; i < a1.length; i++) {
           // System.out.println(a1[i]);
        }
        
    }

    public static void merge(int[] a, int lo, int hi) {
        // System.out.println(lo);
        // System.out.println(hi);
            if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        merge(a, lo, mid);
        merge(a, mid + 1, hi);
    
        int[] buf = Arrays.copyOf(a, a.length);
    
        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];
        
        //myLib.printIntArray(buf);
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
    
            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
        //myLib.printIntArray(a);
    }
}
