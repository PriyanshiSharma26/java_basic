interface MathOperation {
    int operate(int a, int b);
}

class LambdaMathExample {
    public static void main(String[] args) {
    
        MathOperation add = (a,b) -> a + b;
    
        MathOperation subtract = (a,b) -> a - b;

        MathOperation multiply=(a,b) -> a * b;

        MathOperation division=(a,b) -> a / b;

        MathOperation reminder=(a,b) -> a % b;

    
        System.out.println("5 + 3 = " + operate(5, 3, add));

        System.out.println("5 - 3 = " + operate(5, 3, subtract));

        System.out.println("5 * 3 = "+operate(5, 3, multiply));

        System.out.println("5 / 3 = "+operate(5,3 , division));

        System.out.println("5 % 3 = "+operate(5, 3, reminder));
        
    }


    
    private static int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}



//Functional interface

@FunctionalInterface
interface Exp{
void show();
default void data1()
{
    System.out.println("data.....");
}

}

 class demo {
    public static void main(String[] args) {
        Exp imp = ()-> System.out.println("we are child");
        imp.show();
        imp.data1();
        System.out.println(imp);
    }
   


}
