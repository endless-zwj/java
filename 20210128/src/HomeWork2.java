import java.util.concurrent.Callable;

class Calculator {
    public int num1 ;
    public int num2 ;

    public int Add (int num1 , int num2) {
        return num1 + num2 ;
    }

//    public Calculator(int num1 , int num2)
//    {
//        this.num1 = num1 ;
//        this.num2 = num2 ;
//    }

    public int Sub (int num1 , int num2) {
        return num1 - num2 ;
    }

    public int Mul (int num1 , int num2) {
        return num1 * num2 ;
    }

    public int Div (int num1 , int num2) {
        return num1 + num2 ;
    }
}

public class  HomeWork2 {
    public static void main(String[] args) {
        Calculator add = new Calculator() ;
        System.out.println(add.Add(12, 34));

    }
}
