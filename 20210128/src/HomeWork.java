import javafx.scene.effect.Light;

class Add {
   public int num1 ;
   public int num2 ;

   public Add (int num1 , int num2) {
       System.out.println((num1 + num2));
   }
}

class Sub {
    public int num1;
    public int num2;

    public Sub(int num1, int num2) {
        System.out.println((num1 - num2));
    }
}

class Mul {
    public int num1;
    public int num2;

    public Mul(int num1, int num2) {
        System.out.println((num1 * num2));
    }
}

class Div {
    public int num1 ;
    public int num2 ;

    public Div (int num1 , int num2) {
        System.out.println((num1 / num2));
    }
}


public class HomeWork {
    public static void main(String[] args) {
        Add add = new Add(12,23);
        Div div = new Div(45,14);
    }
}
