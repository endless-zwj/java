
import java.util.Arrays;

public class TextDemo {

    public static void main(String[] args) {
        int[] array = null ;
       // System.out.println(array[0]);           -----------> array 引用的是一个空对象，没有分配空间，也没有值
       // array = new int[]{23,34,34} ;           ------------------>新建一个对象可以为数组初始化
       // array = {2,56} ;                        ------------------>错误的初始化方式
        System.out.println(array[0]);
    }


    /**
     * 自定义 My_Array.ToString 函数
     * @param args
     */
    public static String myToString (int[] array) {
        String ret = "[" ;
        for (int i = 0; i <array.length ; i++) {
            ret += array[i] ;
            if (i != array.length-1)
            {
                ret += "," ;
            }
        }
        ret += "]" ;
        return ret ;
    }

    public static void main7(String[] args) {
        int[] array = new int[]{23,45,75};
        String ret = myToString(array) ;
        System.out.println(ret);
    }



    /**
     * 用数组传参实现函数的交换
     * @param args
     */
    public static void swap(int[] array) {
        int tmp = array[0] ;
        array[0] = array[1] ;
        array[1] = tmp ;
    }


    public static void main6(String[] args) {
        int[] array = new int[]{23,45};
        System.out.println(Arrays.toString(array));
        swap(array);
        System.out.println(Arrays.toString(array));
    }



    /**
     * java 的数组传参
     * java 可返回一个数组类型（引用类型）
     * @param args
     */
    public static int[] func(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            tmp[i] = 2 * array[i] ;
        }
        return tmp ;
    }

    public static void main5(String[] args) {
        int[] array = new int[]{12,34,35};
        int[] ret = func( array) ;
        System.out.println(Arrays.toString(ret));
    }




    /**
     * 打印数组的方法
     * -----> Arrays 一个操作数组的工具类
     * Array.sort ---> 对数组进行排序
     * Array.toString(array) --->打印数组，以字符串的形式
     * @param args
     */
    public static void main4(String[] args) {
       int[] array = {123,345,66,45};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }



    /**
     * 遍历数组的方法
     * @param args
     */
    public static void main3(String[] args) {
        int[] array = new int[]{1,3,5,6} ;
//        for (int i = 0; i < array.length ; i++) {           //------> for(i)  能具体修改下标为 i 的值
//            System.out.println(array[i]);
//        }

        for (int x:array) {                                  // ------> foreach遍历数组 但不能对具体下标修改
            System.out.println(x + " ");
        }
    }



    /**
     * 数组的属性
     * @param args
     */
    public static void main2(String[] args) {
        int[] arr = new int[] {1,2,3,4} ;
        int len = arr.length;                                         // ---------->     length表示数组的属性
        System.out.println(len);
    }




    /**
     * 数组的定义
     *  new : 实例化一个对象，并在堆上为这个对象开辟一块空间
     * @param args
     */
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4} ; //[]内不放下标值，计算机会自动计算出数组内的元素个数
        int[] arr2 = new int[] { 1 , 2 , 3 ,4 } ;  //new 一个对象
        int[] arr3 = new int[4] ; //默认数组内的值为 0
    }
}
