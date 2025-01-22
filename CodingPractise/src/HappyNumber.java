import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n =2;

        int num = n;
        Set<Integer> set = new HashSet<>();

        while(num!=1 && !set.contains(num)){
            set.add(num);
            num = helper(num);
        }
        System.out.println(num == 1);
    }
    public static int helper(int num){
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum+= rem * rem;
            num/=10;
        }
        return sum;
    }
}
