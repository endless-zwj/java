import java.util.Arrays ;

public class TextDemo {
    /**
     * 数组拷贝的四种方法:
     * 1.用for循环便历一遍数组
     * 2.Arrays.copyOf
     * 3.System.arraycopy
     * 4.clone():产生一个副本
     * @param args
     */


    /**
     * 方法1 自定义 arrayCopy
     * for 遍历数组
     * @param args
     */

    public static int[] arrayCopy(int[] array) {
        int[] ret = new int[array.length] ;
        for (int i = 0; i <array.length ; i++) {
            ret[i] = array[i] ;
        }
        return ret ;
    }

    public static void main1(String[] args) {
        int[] array = new int[] {23 , 43 , 54 , 64 } ;
        System.out.println(Arrays.toString(arrayCopy(array))) ;
    }


    /**
     * 方法2 Arrays包下的一个方法
     * Arrays.copyof
     * 源代码：
     * public static int[] copyof
     * (目标数组int[] original  ， 拷贝的长度newlength )
     * {
     *     int[] copy = new int[newlength] ;
     *     System.arraycopy (original , srcPos 0 ,copy, desPos 0,
     *     Math.min()(original.length ,newlength)              );
     *
     *     return copy;
     * }
     * @param args
     */
    public static void main2(String[] args) {
        int[] array = new int[] {23 , 43 , 54 , 64 } ;
        int[] ret = new int[array.length] ;
        ret = Arrays.copyOf(array , array.length) ;
        System.out.println(Arrays.toString(ret));
    }

    /**
     * 方法三：System.arraycopy
     * 源代码
     * public static native void arrays
     * (Object src原数组,int srcPos开始拷贝位置,Object des目的地数组，拷贝起始位置，长度)
     * {
     *     .....
     * }
     * @param args
     */
    public static void main3(String[] args) {
        int[] array = { 12 , 32 , 43 , 54 } ;
        int[] ret = new int[array.length] ;
        System.arraycopy(array ,0, ret , 0,array.length);
        System.out.println(Arrays.toString(ret));
    }


    /**
     * 方法四 colone
     * ret = 目标数组.clone();
     * 产生了这个对象的一个 副本   这个方法是Object 的克隆方法
     * Object : 是所有类的父类
     * @param args
     */
    public static void main4(String[] args) {
        int[] array = new int[] {23 , 43 , 54 , 64 } ;
        int[] ret = new int[array.length] ;
        ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }


    /**
     * 求数组最大值
     * @param args
     */
    public static int findMax(int[] array) {
        int max = array[0] ;
        for (int i = 0; i <array.length ; i++) {
            max = Math.max( max , array[i]) ;
        }
        return max ;
    }

    public static void main5(String[] args) {
        int[] array = new int[] {23 , 43 , 54 , 64 } ;
        int ret = findMax(array) ;
        System.out.println(ret);
    }


    /**
     * Arrays包下的几种方法:
     * 1.Arrays.binaSearch
     * 2.Arrays.equals
     * 3.Arrays.fill
     * 4.Arrays.toString
     * 5.Arrays.sort
     * @param args
     */


    /**
     * 方法一 :
     *  Arrays.binaSearch
     * 源码：
     * (返回下标)Arrays.binary.Search(array,fromIndex,toIndex,key)
     *  {
     *     .....[fromIndex,toIndex)
     *          左闭右开
     *  }
     * @param args
     */
    public static void main6(String[] args) {
        int[] array = new int[] {23 , 43 , 54 , 64 } ;
        System.out.println(Arrays.binarySearch(array, 43));
    }


    /**
     * 方法二：
     * Arrays.equals
     * 用于判断两数组是否相等
     * @param args
     */
    public static void main7(String[] args) {
        int[] array = new int[] {23 , 43 , 54 , 64 } ;
        int[] array2 = {23 ,534 ,63 ,21 } ;
        System.out.println(Arrays.equals(array, array2));
    }

    /**
     * 方法三:
     * Arrays.fill
     * 数组填充
     * @param args
     */
    public static void main8(String[] args) {
        int[] array = new int[] {23 , 43 , 54 , 64 } ;
        Arrays.fill(array,0,array.length,3);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 方法四：
     * Arrays.sort
     * @param args
     */
    public static void main9(String[] args) {
        int[] array = new int[] {23 , 11, 54 , 3 ,32} ;
        Arrays.sort(array,1,4);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 判断数组是否有序
     * @param args
     */
    public static boolean isUp(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[i+1] ) {
                return false ;
            }
        }
        return true;
    }

    public static void main10(String[] args) {
        int[] array = new int[] {23 , 11, 54 , 3 ,32} ;
        boolean ret = false ;
        ret = isUp(array) ;
        System.out.println(ret);
    }


    /**
     * 数组奇放后偶放前
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[] {23 , 11, 54 , 3 ,32} ;

        int left = 0 ;
        int right = array.length -1 ;
        while (left < right) {
            if ( array[left] % 2 == 0  && left < right) {
                left++ ;
            }
            if ( array[right] % 2 == 1  && left < right) {
                right--;
            }
            if (left < right) {
                int tmp = array[left] ;
                array[left] = array[right] ;
                array[right] = tmp ;
            }


        }
        System.out.println(Arrays.toString(array));
    }
}



