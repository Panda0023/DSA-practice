import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans=armstrong(n);
        System.out.println(ans);

    }

    static boolean armstrong(int num) {
        int temp=num;
        //Here we check for 3 digit numbers whether it's armstrong or not
        int sum=0;
        if (num < 100 || num > 1000) {
            return false;
        }
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem*rem*rem;
            num=num/10;

        }
        return sum==temp;
    }
}