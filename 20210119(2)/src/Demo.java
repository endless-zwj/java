import java.util.Scanner;

public class Demo {
//    2迭代实现斐波那锲
    public static int fibo2(int n) {
        int f1 = 1 ;
        int f2 = 1 ;
        int f3 = 0 ;
        if(n ==1 || n == 2) {
            return 1 ;
        }
        for(int i = 3 ; i <= n ; i ++) {
            f3 = f1 + f2 ;
            f1 = f2 ;
            f2 = f3 ;
        }
        return f3 ;
    }

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in) ;
    int n = scan.nextInt() ;
    System.out.println( fibo2(n) ) ;
}





//  1递归实现斐波那锲
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1 ;
        }
        return fibonacci(n - 1 ) + fibonacci(n - 2) ;
    }

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt() ;
        System.out.println(fibonacci(n)) ;
    }
}
