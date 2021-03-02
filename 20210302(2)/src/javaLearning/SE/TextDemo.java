package javaLearning.SE;

public class TextDemo {

    /**
     * 接口：
     * 1.接口中的方法都是抽象方法；
     * 2.其实可以有具体的实现方法，这个方法是default修饰的
     * 3.接口当中定义的成员变量，默认是常量。
     * 4.  接口当中的成员变量默认是:
     *  public static final
     *     接口当中的成员方法默认是：
     *  public abstract
     *  //在定义变量的 成员方法 和 成员变量 时可省略默认部分
     * 5.接口是不可以被实例化的。
     * 6.类和接口的关系 ： implements(执行/实施)
     * 7.接口可以解决java当中的单继承问题。
     * 8.只要这个类实现了该接口，那么就可以进行向上转型
     *
     * @param args
     */

    public static void Walk(IRunning iRunning) {
        System.out.println("我准备散步！");
        iRunning.run();
    }

    public static void main(String[] args) {
        IRunning iRunning = new Robot() ;
        Walk(iRunning);
    }

    /**
     * 抽象类：
     * 1.抽象方法：一个方法如果被abstract修饰，那么这个方法是抽象方法
     * 抽象方法可以没有具体实现。
     * 2.包含抽象方法的类，抽象类。
     * 3.抽象方法不含有函数体(body)
     *
     * 注意:
     * 1.抽象类不可以被实例化。不能Shape shape = new Shape()
     * 2.抽象类主要是用来被继承的。
     * 3.类内数据成员和普通类无区别。
     * 4.如果一个非抽象类继承了抽象类，那么这个类必须重写这个抽象方法。
     * 5.抽象类或抽象方法一定不能被fianl修饰。
     * @param args
     */

    public static void TextAbstract(Shape shape) {
        shape.draw();
    }

    public static void main1(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        TextAbstract(shape1);
        TextAbstract(shape2);
    }
}
