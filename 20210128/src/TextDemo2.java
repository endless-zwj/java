
class Person {
    public String name ;
    public int age = 6 ;
    public static int height ;


    //构造方法
    public Person () {
        System.out.println("不含参构造方法");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("含参构造方法");
    }

    //代码块
    {
        System.out.println("实例代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TextDemo2 {
    public static void main(String[] args) {
        Person person = new Person("朱文健", 18) ;
        System.out.println(person);
    }
}
