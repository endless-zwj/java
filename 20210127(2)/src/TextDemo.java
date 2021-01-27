class Student {
    private String name ;
    private static int age ;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Student.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class TextDemo {
    public static void main(String[] args) {
       Student stu = new Student() ;
       stu.setName("朱文健");
//        System.out.println(stu.getName());
       Student.setAge(18);
//        System.out.println(Student.getAge());

        System.out.println(stu);

    }
}
