package Tests;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        char[] charArrays = new char[5];

        charArrays[0] = 'a';
        charArrays[1] = 'g';
        charArrays[2] = 'b';
        charArrays[3] = 'v';
        charArrays[4] = 'z';

        Arrays.sort(charArrays);

        Arrays.fill(charArrays, 'n');

        System.out.println(charArrays);
    }
}
