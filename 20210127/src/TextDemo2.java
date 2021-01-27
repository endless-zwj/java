public class TextDemo2 {
    /**
     * 从【 1 ，4 ，3， 1, 3 ，2 ，4】中找出只出现一次的数字
     *
     * 方法：位运算
     * 0与任何数异或都位本身
     * @param args
     */
    public static void main(String[] args) {

        int[] array = new int[]{1,4,3,1,3,2,4};
        int ret = 0 ;
        for (int i = 0; i <array.length ; i++) {
            ret = ret ^ array[i] ;
        }
        System.out.println(ret);
    }
}
