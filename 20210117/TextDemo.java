import java.util.Scanner;

public class TextDemo{
/**
 * 5的阶乘和 法二
 * @param args [description]
 */
public static void main(String[] args) {
	int ret = 1 ;
	int num = 1 ;
	int sum = 0 ;
	while(num <= 5) {
		ret *= num ;
		sum += ret ;
		num++ ;
	}
	System.out.println(sum) ;
}



/**
 * while计算5的阶乘和
 * 5!+4!+3!+2!+1!
 * @param args [description]
 */
public static void main5(String[] args) {
	int sum = 0 ;
	int num = 1 ;
	
	while( num <= 5) {
		int i =1;
		int ret = 1 ;
		while(i <= num) {
			
		 	ret *= i ;
		 	i++ ;
		}
		sum += ret ;
		num++ ;
	}
	System.out.println(sum);
}



/**
 * 用while计算5的阶乘
 * @param args [description]
 */
public static void main4(String[] args) {
	int num = 1;
	int ret = 1;
	while(num<=5) {
		ret*=num;
		num++;
	}
	System.out.println(ret);
}


/**
 * 面试问题：
 * 不能做switch的参数类型有：
 *  long float double boolean
 *  switch中的参数只能是 整数（除了long）|枚举|字符|字符串
 */
// public static void main4(String[] args) {
// 	boolean a = ture;
// 	switch(a) //错误的输入 boolean类型无法转换为int类型
// 	{
// 		.....
// 	}
// }



/**
 * 输入年份，判断是否为闰年
 * 1:多组输入：scan.hasNext()
 *   结束标志： Ctrl + C 直接退出程序
 *             Ctrl + D 正常退出程序
 */
public static void main3(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()) {
		int year = scan.nextInt();
		if( (year%4==0&&year%100!=0) || year%400==0 ) {
			System.out.println("是闰年！");
		}  else {
				   System.out.println("不是闰年！");
		}
	}
}


/**
 * java中Scanner的 next与nextLine
 *
 * next：读取到有效字符后才会停止读取；中间过程中的空格与‘\n’都不读，会自动跳过
 * nextLine:结束标志位enter.即会读取enter前的字符
 */
		public static void main2(String[] args) {
			Scanner scan = new Scanner(System.in);
			int a=scan.nextInt();
			String b=scan.next();
			// String c=scan.nextLine();
			System.out.println(a);
			System.out.println(b);
			// System.out.println(c);
}



/**
 * java里的输入
 * 1: import java.util.Scanner
 * 2: Scanner 变量名 = new Scanner(System.in)
 * 3: 变量名.next...()
 * @param args [description]
 */
 		public static void main1(String[] args) {
 			Scanner scan = new Scanner(System.in);//System.in指从键盘输入
 			int a = scan.nextInt();
 			System.out.println(a);
 		}
 }