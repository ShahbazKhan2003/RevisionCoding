import java.util.Arrays;

public class Max3DigitNumUsingK {
    public static void main(String[] args) {
        System.out.println(maximizeValue(512, 10)); // 972
        System.out.println(maximizeValue(191, 4));  // 591
        System.out.println(maximizeValue(286, 20)); // 999
    }
    public static int maximizeValue(int N, int K) {
        // 1 9 1
        char[] digits = String.valueOf(N).toCharArray();
        int[] numDigits = new int[3];
        for (int i = 0; i < 3; i++) {
            numDigits[i] = digits[i] - '0';
        }

        int idx = 0;
        while(K>0 && idx <3){
            while (K>0 && numDigits[idx] < 9){
                numDigits[idx]++;
                K--;
            }
            idx++;
        }
        N = numDigits[0] * 100 + numDigits[1] * 10 + numDigits[2];
        return N;
    }
}
