import java.util.Arrays;

public class TextDemo {

    /**
     * 二维数组的定义与初始化
     * 二维数组的访问
     * @param args
     */
    public static void main1(String[] args) {
        int[][] array = new int[][] { {1 , 2 , 6} , { 3 , 4 ,5}} ;
        int[][] array2= new int[2][3];
        array2[0] = new int[]{2} ;//array2[0]数组中只有一位元素

        System.out.print(Arrays.deepToString(array2) + " ");
        System.out.println();

        // for i 遍历二维数组
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();

        //for each 遍历二维数组
        for (int[] tmp: array) {
            for (int x: tmp) {
                System.out.print(x + " ");
            }
        }

        //toString方法遍历二维数组
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));
    }


    /**
     * 不规则二维数组初始化
     * @param args
     */
    public static void main(String[] args) {
        int array[][] = new int[2][] ;
        array[0] = new int[]{1 , 3 , 5 } ;
        array[1] = new int[]{4 , 6 , 6 } ;

    }
}
