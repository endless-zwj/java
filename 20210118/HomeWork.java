/*import java.util.Scanner;
import java.util.Random ;*/

import java.util.*; //导入java.util下的所有包；

public class HomeWork {
/**
 * 输入用户信息
 * @param args [description]
 */
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in) ;
	System.out.println("请输入姓名:") ;
	String name = scan.nextLine() ;
	System.out.println("请输入年龄:") ;
	int age = scan.nextInt() ;
	System.out.println("请输入体重:") ;
	float weight =scan.nextFloat() ;
	System.out.println("你的具体信息如下:") ;
	System.out.println("姓名:" + name + "\n" + "年龄" + age + "\n" + "体重" + weight) ;
	scan.close() ;
}



/**
 * 模拟输入密码 要求最多输入三次
 * 判断字符串是否相等:  【我的串.equals(目标串)】//表示串相等
 * @param args [description]
 */
	public static void main10(String[] args) {
	
	int count = 3 ;
	while (count != 0) {
	System.out.println("请输入密码:") ;
	Scanner scan = new Scanner(System.in) ;
	String password = scan.nextLine() ;
		if(password.equals("123456") ) {
			System.out.println("密码正确，登录成功!");
			break ;
		} else {
			System.out.println("密码错误！") ;
			count-- ;
			System.out.println("你还有" + count + "次机会") ;
		}
	}
}



/**
 * 水仙花数
 * @param args [description]
 */
	public static void main9(String[] args) {
	
	for (int i = 0 ; i < 999 ; i++) {
		int j = i ;
		int count = 1 ;
		while ((j / 10) != 0) {
			count++ ;
			j /= 10 ;
		}
		j = i ;
		int sum = 0; //sum不能定义在循环体外部
		while(j != 0) {
			sum += Math.pow((j%10) , count) ;
			j /= 10 ;
		}
		if (sum == i) {
			System.out.println(i + "是水仙花数") ;
		}
 	}
}


/**
 * 记录 1-->100 中出现9的个数
 * @param args [description]
 */
	public static void main8(String[] args) {
	int count = 0 ;
	for(int i = 1 ; i <= 100 ; i++) {
		int j = i ;
		while(j % 10 != 0) {
			if(j % 10 == 9) {
				count++ ;
			}
			j /= 10 ;
		}
	}
	System.out.println(count) ;
}


/**
 * 计算  1/1-1/2+1/3-....-1/100
 * @param args [description]
 */
	public static void main7(String[] args) {
		int flag = 1 ;
		double sum = 0 ;
		for(int i = 1; i <= 100 ; i++) {
			sum += flag * (1.0 / i) ;
			flag = - flag ;
		}
		System.out.println(sum) ;
	}



/**
 * 求两个数最大公约数
 * @param args [description]
 */
public static void main6(String[] args) {
	Scanner scan = new Scanner(System.in) ;
	int a = scan.nextInt() ;
	int b = scan.nextInt() ;
	int r = a % b ;
	while(r != 0) {
		a = b ;
		b = r ;
		r = a % b ;
	}
	System.out.println("最大公约数为:"+ b) ;
}



/**
 * 打印九九乘法表
 */
public static void main5(String[] args) {
	for(int i = 1 ; i <= 9 ; i++) {
		for(int j = 1 ; j<= i ; j++ ) {
			//System.out.print(" i*j= "+ i * j);错误输入
			System.out.print(i+"*"+j+"="+i*j +" ") ;
		}
		System.out.println();
	}
}

/**
 * 输出1000-->2000里的闰年
 * @param args [description]
 */
public static void main4(String[] args) {
	Scanner scan = new Scanner(System.in) ;
	int year = scan.nextInt() ;
	
	for(int i = 1000 ; i <= year ; i++) {
		if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
			System.out.println(i+"是闰年") ;
		}
	}
}


/**
 * 打印1-->n下的所有素数
 * @param args [description]
 */
public static void main3(String[] args) {
	Scanner scan = new Scanner(System.in) ;
	int n = scan.nextInt() ;
	for(int i = 1 ; i <= n ; i++) {
		int j = 2 ;
		for( ; j < i ; j++) {
			if(i % j == 0) {
				break;
			}	
		}
		if(i == j) {
			System.out.println(i + "是素数") ;
		}
	}

}



/**
 * 判断素数
 * @param args [description]
 */
public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		int i = 0 ;
		while (scan.hasNextInt()) {
			int a = scan.nextInt() ;
			for ( i = 2 ;i < a ; i++ ) {
				if (a % i ==0) {
					break ;
				}
			}
			if (i == a) {
				System.out.println(a+"是素数") ;
			} else {
				System.out.println(a + "不是素数") ;
			}
		}
}



/**
 * 判断年龄
 * @param args [description]
 */
	public static void main1(String[] args) {
		Scanner scan = new Scanner (System.in) ;
		while (scan.hasNextInt()) {
			int year = scan.nextInt() ;
			if (year <= 18) {
				System.out.println("少年");
			} else if (year > 18 && year <= 28) {
				System.out.println("青年");
			} else if (year > 28 && year <= 55) {
				System.out.println("中年");
			} else {
				System.out.println("老年");
			}
		}
	}
}