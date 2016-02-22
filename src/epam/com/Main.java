package epam.com;

import java.util.Arrays;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Main {

    public static void main(String[] args) {


        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Arrays.sort(m);
        int min = m[0];
        int max = m[11];
        int mid = m[11]/2;

        System.out.println("Min"+ min);
        System.out.println("Max"+ max);
        System.out.println("Mid"+ mid);
    }
}
