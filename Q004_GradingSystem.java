import  java.util.*;
public class Q004_GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("O");
        }
        else if(marks >= 80 && marks < 90){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }

        System.out.println("You scored : "+marks);
    }
}
