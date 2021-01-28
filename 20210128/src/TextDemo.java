class Student {
    public static int age = 15 ;

     public static void SetAge() {
        age =  16 ;
    }
}

public class TextDemo {
    public static void main(String[] args) {
        Student.SetAge();
        System.out.println(Student.age);
    }
}
