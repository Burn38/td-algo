package TP04;

public class TestCroissantTableau {

    public static void main(String[] args) {
        System.out.println(isGrowing(new double[] {1.0, 4.0, 3.0}));
    }

    public static boolean isGrowing(double[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }

}
