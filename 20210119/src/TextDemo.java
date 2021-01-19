import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
* 方法重载：
* 1、方法名相同。
* 2、返回值不做要求。
* 3、参数列表不同。（参数类型 参数个数不同）
*
* 面试题：
*   重载和重写的区别是什么?
* */
public class TextDemo {
//按顺序剥离一个数
    public static void func(int n) {
        if(n / 10 != 0) {
            func(n/10) ;
        }
        System.out.println(n % 10);
    }
    /**
     * 输入一个数字 并按顺序输出每一位数字
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt() ;
        func(n) ;
    }


//1求两个数最大值的函数
    public static int numMax2 (int num1 , int num2) {
        return num1 > num2 ? num1 : num2 ;
    }

//2求三个数最大值的函数
    public static int numMax3 (int num1 , int num2 , int num3) {
        return numMax2(numMax2(num1 ,num2) , num3) ;
    }

//3求两数和的函数
    public static int sumTwo (int a , int b) {
        return a + b ;
    }

//4.求某个数阶乘
    public static int factor (int n) {
        int ret = 1 ;
        for (int i = 1 ; i <= n ; i++) {
            ret *= i ;
        }
        return ret ;
    }

//5求阶乘和 调用4函数
    public static int sumFactor(int n) {
        int sum = 0 ;
        for (int i = 1 ; i <= n ; i++) {
            factor (i) ;
            sum += factor (i) ;
        }
        return sum ;
    }

//递归求阶乘
    public static int factor2(int n) {
        if (n == 1) {
            return 1 ;
        } else {
            return n * factor2(n-1 );
        }
    }

    /**
     * 函数的调用
     * @param args
     */
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in) ;

//        int num1 = scan.nextInt() ;
//        int num2 = scan.nextInt() ;
//        int num3 = scan.nextInt() ;
//
//        int a = 10 ;
//        int b = 20 ;

//        System.out.println(numMax2(num1, num2));
//        System.out.println(numMax3(num1, num2, num3));

//        System.out.println(sumTwo(80,70 ) );

       int n = scan.nextInt() ;
//        System.out.println(factor(n)) ;
//        System.out.println(sumFactor(n));
        System.out.println(factor2(n));
    }


    /**
     * 输出二进制数各位上的数
     * @param args
     */
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt() ;
        //输出一个二进制数奇数位上的各位
        System.out.print("奇数位： ");
        for (int i = 30 ; i >= 0 ; i -= 2 ) {
            System.out.print(((n >> i) & 1) + " ");
        }
        System.out.println();
        System.out.print("偶数位： ");
        for (int i = 31 ; i >= 1 ; i -= 2 ) {
            System.out.print(((n >> i) & 1) + " ");
        }
    }


    /**
     * 判断一个数的二进制中含有几个 1 (2)
     * 方法 用该数与（&）一个减一的数 ---> 结果的二进制数中 1 减一
     * @param args
     */
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt() ;
        int count = 0 ;
        while(n != 0) {
            n = n & (n - 1) ;
            count++ ;
        }
        System.out.println(count);
    }


    /**
     * 判断一个数的二进制中含有几个 1 (1)
     * 方法：与 1 相与 (&) 若结果为 0 说明该数二进制最后一位为 0 ； 右移二进制位
     * @param args
     */
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int a = scan.nextInt() ;
        int count = 0 ;
        for (int i = 0 ; i <= 31 ; i++) {
            if( ((a>>i) & 1) != 0 ) {
                count++ ;
            }
        }
        System.out.println(a);
    }
}
