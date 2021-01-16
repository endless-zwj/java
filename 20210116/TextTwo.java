
public class TextTwo{
	/**
	 * 字符串类型；
	 * String
	 */
    public static void main(String[] args) {
    	String str ="hello world";
    	System.out.println(str);
    }



	/**
	 * 布尔类型
	 * 1.java中 布尔类型没有明确的大小
	 * 2.java中 布尔类型取值只有 ture和false
	 * 3.java中 没有所谓 0真 非零假
	 * 4.包装类 Boolean
	 */
    public static void main5(String[] args) {
    	Boolean flag =true;
		System.out.println(flag);	
    }


	/**
	 * 字节型数据：byte  1个字节 数值 -128-->127
	 */
    public static void main5(String[] args) {
    	byte a = 12;
    	//byte b = Byte.MAX_VALUE+1; 编译报错  发生整形提升 int放入byte会数据丢失;
   
    	System.out.println(Byte.MAX_VALUE+1);//println默认打印整形 输出128
    	System.out.println(Byte.MAX_VALUE);
    	System.out.println(Byte.MIN_VALUE);
    // }



	/**
	 *字符数据类型
	 *  char 2个字节 0-65535
	 *  Unicode ---> 包含了很多 如 中文 希腊文
	 *               一个中文占两个字节
	 * @param args [description]
	 */
	public static void main4(String[] args) {
		
		char ch = 'a';
		System.out.println("ch的字符:" + ch);

		char ch2 = '高';
		System.out.println(ch2);

		char ch3 = 97;
		System.out.println(ch3);
	}





	/**
	 * 双精度 浮点型
	 * @param args [description]
	 */
	public static void main3(String[] args) {
		double a =12.5;//小数默认为双精度
		System.out.println("a的值：" + a );
		System.out.println("a的最大值:" + Double.MAX_VALUE);
		System.out.println("a的最小值:" + Double.MIN_VALUE);

		double num=1.1;
		System.out.println(num*num);//浮点数都是有误差的
	}




	/**
	 * main中的 string[] args
	 *          args: 运行中的参数命令行
	 *                在java命令后输入字符串数组
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
	 * 长整形
	 * @param args [description]
	 */

	public static void main1(String[] args) {
		
		long a = 10;

		System.out.println("a的值:"+a);
		System.out.println("a的最大值:" + Long.MAX_VALUE);
		System.out.println("a的最小值:" + Long.MIN_VALUE);//任何类型的数据 和 字符串拼接 结果都是字符串

		int b =20;
		int c =30;

		System.out.println("hhh" + (b+c));
	}
}