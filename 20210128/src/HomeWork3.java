
class MyValue {
    public int val ;
}

public class HomeWork3 {
    //交换两个变量的值，要求交换实参；
    public static void Swap(MyValue myValue1 ,MyValue myValue2) {
        int tmp = myValue1.val;
        myValue1.val = myValue2.val ;
        myValue2.val = tmp ;
    }

    public static void main(String[] args) {

        MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();
        myValue1.val = 10 ;
        myValue2.val = 20 ;
        Swap(myValue1,myValue2);
        System.out.println("myvalue1 = " + myValue1.val + " " + "myvalue2 = " +myValue2.val );

    }
}
