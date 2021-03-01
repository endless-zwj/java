package javaLearning.SE;

public class TextDemo {
    
    /**
     * 多态
     * 1）运行时绑定发生：
     * 父类引用引用子类对象，且调用同名的覆盖方法
     *    注：子类的同名方法访问权限大于等于父类；
     *
     *  >>
     * 2）方法的重写：（override）
     *   条件: 方法名相同，参数列表相同，返回值相同
     * @param args
     */
    public static void main5(String[] args) {
        Animal animal = new Cat("咪咪" );
        animal.eat();
    }
    /**
     * 发生向上转型的时机：
     * 1.直接赋值（new对象）
     * 2.函数传参
     * 3.函数的返回值
     * @param args
     */

    //2.函数传参
    public static void func1 (Animal animal) {
        animal.eat();
    }
    public static void main4(String[] args) {
        Cat cat = new Cat("咪咪") ;
        func1(cat) ;
    }

    //3.函数返回值
    public static Animal func2() {
        Cat cat = new Cat("小红") ;
        return cat ;
    }

    public static void main3(String[] args) {
        Cat cat = new Cat("小黑") ;
        func2() ;
        Animal animal = func2() ;
        System.out.println(animal.name);

    }
    /**
     * 向上转型 :父类引用 引用 子类对象
     * 1.发生向上转型后，父类引用只能访问父类的方法和属性
     * @param args
     */
    public static void main2(String[] args) {
        Animal animal = new Bird("布谷") ;
        animal.sleep();
    }

    /**
     * 1.子类在构造时要先帮父类进行构造
     * 2.父类和子类的访问权限不用 private 与 protected
     * @param args
     */
    public static void main1(String[] args) {
        Bird birdSon = new Bird("八哥") ;
        birdSon.fly();
    }
}
