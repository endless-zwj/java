import java.util.Scanner;

public class TextDemo{
/**
 * 5�Ľ׳˺� ����
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
 * while����5�Ľ׳˺�
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
 * ��while����5�Ľ׳�
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
 * �������⣺
 * ������switch�Ĳ��������У�
 *  long float double boolean
 *  switch�еĲ���ֻ���� ����������long��|ö��|�ַ�|�ַ���
 */
// public static void main4(String[] args) {
// 	boolean a = ture;
// 	switch(a) //��������� boolean�����޷�ת��Ϊint����
// 	{
// 		.....
// 	}
// }



/**
 * ������ݣ��ж��Ƿ�Ϊ����
 * 1:�������룺scan.hasNext()
 *   ������־�� Ctrl + C ֱ���˳�����
 *             Ctrl + D �����˳�����
 */
public static void main3(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()) {
		int year = scan.nextInt();
		if( (year%4==0&&year%100!=0) || year%400==0 ) {
			System.out.println("�����꣡");
		}  else {
				   System.out.println("�������꣡");
		}
	}
}


/**
 * java��Scanner�� next��nextLine
 *
 * next����ȡ����Ч�ַ���Ż�ֹͣ��ȡ���м�����еĿո��롮\n�������������Զ�����
 * nextLine:������־λenter.�����ȡenterǰ���ַ�
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
 * java�������
 * 1: import java.util.Scanner
 * 2: Scanner ������ = new Scanner(System.in)
 * 3: ������.next...()
 * @param args [description]
 */
 		public static void main1(String[] args) {
 			Scanner scan = new Scanner(System.in);//System.inָ�Ӽ�������
 			int a = scan.nextInt();
 			System.out.println(a);
 		}
 }