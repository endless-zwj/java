
import java.util.Scanner;


public class TextDemo {

//    1递归实现： 输入一个数 返回他各位上数的和
    public static int sumAll(int n) {
        if(n / 10 == 0) {
            return n ;
        }
        return n % 10 + sumAll(n / 10) ;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt() ;
        System.out.println(sumAll(n)) ;
    }
}
