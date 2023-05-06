import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int num = sc.nextInt();
            boolean result = isPerfectNumber(num);

            if (result) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    public static boolean isPerfectNumber(int n){
        if(n ==0)
            return true;
        int sum =0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
}
