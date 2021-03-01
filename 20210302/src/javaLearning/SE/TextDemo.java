package javaLearning.SE;

public class TextDemo {

    /**
     * 多态的优势：
     * 1)降低圈复杂度
     * @param args
     */
    public static void main(String[] args) {
        Shape shapes[] = { new Cycle() , new Triangle() ,new React()} ;
        for (Shape shape:shapes) {
            shape.draw();
        }
    }

    /**
     * 1）多态概念：
     * 1:父类引用 引用子类对象
     * 2：父类和子类有同名的构造方法
     * 3：通过父类引用 调用子类构造方法
     * @param args
     */
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main1(String[] args) {
        drawMap(new Cycle());
        drawMap(new React());
        drawMap(new Triangle());
    }
}
