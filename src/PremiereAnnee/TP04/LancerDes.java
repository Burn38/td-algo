package PremiereAnnee.TP04;

import java.util.Arrays;
import java.util.Random;

public class LancerDes {

    public static void main(String[] args) {
        int[] t = genArr();
        System.out.println(Arrays.toString(t));
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + ": " + getBar(count(t, i)));
        }
    }

    public static int count(int[] arr, int val) {
        int count = 0;
        for (int i : arr)
            if (i == val)
                count++;
        return count;
    }

    public static String getBar(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++)
            sb.append('*');
        return sb.toString();
    }

    public static int[] genArr() {
        return new Random().ints(1000, 1, 7).toArray();
    }

}
