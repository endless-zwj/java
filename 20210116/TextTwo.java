
public class TextTwo{
	/**
	 * �ַ������ͣ�
	 * String
	 */
    public static void main(String[] args) {
    	String str ="hello world";
    	System.out.println(str);
    }



	/**
	 * ��������
	 * 1.java�� ��������û����ȷ�Ĵ�С
	 * 2.java�� ��������ȡֵֻ�� ture��false
	 * 3.java�� û����ν 0�� �����
	 * 4.��װ�� Boolean
	 */
    public static void main5(String[] args) {
    	Boolean flag =true;
		System.out.println(flag);	
    }


	/**
	 * �ֽ������ݣ�byte  1���ֽ� ��ֵ -128-->127
	 */
    public static void main5(String[] args) {
    	byte a = 12;
    	//byte b = Byte.MAX_VALUE+1; ���뱨��  ������������ int����byte�����ݶ�ʧ;
   
    	System.out.println(Byte.MAX_VALUE+1);//printlnĬ�ϴ�ӡ���� ���128
    	System.out.println(Byte.MAX_VALUE);
    	System.out.println(Byte.MIN_VALUE);
    // }



	/**
	 *�ַ���������
	 *  char 2���ֽ� 0-65535
	 *  Unicode ---> �����˺ܶ� �� ���� ϣ����
	 *               һ������ռ�����ֽ�
	 * @param args [description]
	 */
	public static void main4(String[] args) {
		
		char ch = 'a';
		System.out.println("ch���ַ�:" + ch);

		char ch2 = '��';
		System.out.println(ch2);

		char ch3 = 97;
		System.out.println(ch3);
	}





	/**
	 * ˫���� ������
	 * @param args [description]
	 */
	public static void main3(String[] args) {
		double a =12.5;//С��Ĭ��Ϊ˫����
		System.out.println("a��ֵ��" + a );
		System.out.println("a�����ֵ:" + Double.MAX_VALUE);
		System.out.println("a����Сֵ:" + Double.MIN_VALUE);

		double num=1.1;
		System.out.println(num*num);//����������������
	}




	/**
	 * main�е� string[] args
	 *          args: �����еĲ���������
	 *                ��java����������ַ�������
	 * @param args [description]
	 */
     public static void main2(String[] args) {
     	
     	for(int i = 0;i<args.length;i++)
     	{
     		System.out.println(args[i]);
     	}
     	System.out.println("hahaha");
     }




	/**
	 * ������
	 * @param args [description]
	 */

	public static void main1(String[] args) {
		
		long a = 10;

		System.out.println("a��ֵ:"+a);
		System.out.println("a�����ֵ:" + Long.MAX_VALUE);
		System.out.println("a����Сֵ:" + Long.MIN_VALUE);//�κ����͵����� �� �ַ���ƴ�� ��������ַ���

		int b =20;
		int c =30;

		System.out.println("hhh" + (b+c));
	}
}