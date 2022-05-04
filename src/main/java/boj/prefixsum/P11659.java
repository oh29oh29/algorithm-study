package boj.prefixsum;

public class P11659 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};
        int start = 1;
        int end = 3;

        int result = new P11659().solution(array, start, end);
        System.out.println(result);
    }

    public int solution(int[] array, int start, int end) {
        int length = array.length;

        int[] s = new int[length + 1];
        for (int i = 1; i <= length; i++) {
            s[i] = s[i - 1] + array[i - 1];
        }

        return s[end] - s[start - 1];
    }
}