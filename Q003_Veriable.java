public class Q003_Veriable {
    public static void main(String[] args) {
        //SUM
        int a = 10;
        int b = 20;
        int sum = a + b ;
        System.out.println("Sum is : "+sum);

        //Product
        int prod = a * b;
        System.out.println("Product is : "+prod);

        // Expression
        int exp1 = a * b / a + b;
        int exp2 = (a * b)/(a + b);
        System.out.println("Exp 1 : "+exp1);
        System.out.println("Exp 2 : "+exp2);
    }
}
