import java.util.Scanner;
public class bai5 {
    public static void main(String[] agrs) {
		int n;
        int res;
        Scanner sc;
        do {
            System.out.print("Input n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
         
        res = sum_digit_of_num(n);
        System.out.println("Sum of digits of " + n + " is " + res);
         
        sc.close();
    }
     
    public static int sum_digit_of_num(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}