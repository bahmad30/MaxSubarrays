package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // size of array, first number in input
        int n = 5;

        // number of sub arrays, second number in input
        int k = 2;

        // Xo, first number in sequence (not included), third number in input
	    int Xo = 2;

	    // modulus
	    int m = 2147483647;

	    // multiplier
	    int a = 48271;

        long[] nums = linearCongruentialGenerator(Xo, m, a, n, k);

        System.out.println(Arrays.toString(nums));

	    for (int i = 1; i <= k; i++) {
	        int length;
	        try {
                length = (int) nums[(n + (2 * i) - 1)] % (n+1);
                System.out.println(length);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("bad");
            }
        }

    }

    public static long[] linearCongruentialGenerator(int Xo, int m, int a, int n, int k) {
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                nums[i] = (long) Xo * a;
            } else {
                nums[i] = (nums[i - 1] * a) % m;
            }
        }
        return nums;
    }

}
