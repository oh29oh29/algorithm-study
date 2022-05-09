package boj.twopointer;

import java.util.Arrays;

public class P1253 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = new P1253().solution(array);
        System.out.println(result);
    }

    public int solution(int[] array) {
        int result = 0;

        Arrays.sort(array);

        int length = array.length;
        for (int k = 0; k < length; k++) {
            int find = array[k];
            int i = 0;
            int j = length - 1;

            while (i < j) {
                int target = array[i] + array[j];
                if (target == find) {
                    if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    } else {
                        result++;
                        break;
                    }
                } else if (target < find) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return result;
    }
}
