/*import java.util.Scanner;
import java.util.Random ;*/

import java.util.*; //����java.util�µ����а���

public class HomeWork {
/**
 * �����û���Ϣ
 * @param args [description]
 */
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in) ;
	System.out.println("����������:") ;
	String name = scan.nextLine() ;
	System.out.println("����������:") ;
	int age = scan.nextInt() ;
	System.out.println("����������:") ;
	float weight =scan.nextFloat() ;
	System.out.println("��ľ�����Ϣ����:") ;
	System.out.println("����:" + name + "\n" + "����" + age + "\n" + "����" + weight) ;
	scan.close() ;
}



/**
 * ģ���������� Ҫ�������������
 * �ж��ַ����Ƿ����:  ���ҵĴ�.equals(Ŀ�괮)��//��ʾ�����
 * @param args [description]
 */
	public static void main10(String[] args) {
	
	int count = 3 ;
	while (count != 0) {
	System.out.println("����������:") ;
	Scanner scan = new Scanner(System.in) ;
	String password = scan.nextLine() ;
		if(password.equals("123456") ) {
			System.out.println("������ȷ����¼�ɹ�!");
			break ;
		} else {
			System.out.println("�������") ;
			count-- ;
			System.out.println("�㻹��" + count + "�λ���") ;
		}
	}
}



/**
 * ˮ�ɻ���
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
		int sum = 0; //sum���ܶ�����ѭ�����ⲿ
		while(j != 0) {
			sum += Math.pow((j%10) , count) ;
			j /= 10 ;
		}
		if (sum == i) {
			System.out.println(i + "��ˮ�ɻ���") ;
		}
 	}
}


/**
 * ��¼ 1-->100 �г���9�ĸ���
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
 * ����  1/1-1/2+1/3-....-1/100
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
 * �����������Լ��
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
	System.out.println("���Լ��Ϊ:"+ b) ;
}



/**
 * ��ӡ�žų˷���
 */
public static void main5(String[] args) {
	for(int i = 1 ; i <= 9 ; i++) {
		for(int j = 1 ; j<= i ; j++ ) {
			//System.out.print(" i*j= "+ i * j);��������
			System.out.print(i+"*"+j+"="+i*j +" ") ;
		}
		System.out.println();
	}
}

/**
 * ���1000-->2000�������
 * @param args [description]
 */
public static void main4(String[] args) {
	Scanner scan = new Scanner(System.in) ;
	int year = scan.nextInt() ;
	
	for(int i = 1000 ; i <= year ; i++) {
		if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
			System.out.println(i+"������") ;
		}
	}
}


/**
 * ��ӡ1-->n�µ���������
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
			System.out.println(i + "������") ;
		}
	}

}



/**
 * �ж�����
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
				System.out.println(a+"������") ;
			} else {
				System.out.println(a + "��������") ;
			}
		}
}



/**
 * �ж�����
 * @param args [description]
 */
	public static void main1(String[] args) {
		Scanner scan = new Scanner (System.in) ;
		while (scan.hasNextInt()) {
			int year = scan.nextInt() ;
			if (year <= 18) {
				System.out.println("����");
			} else if (year > 18 && year <= 28) {
				System.out.println("����");
			} else if (year > 28 && year <= 55) {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
		}
	}
}