import java.util.*;
public class Q016_PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter lenght of 1st line : ");
        int a = sc.nextInt();
        System.out.print("Enter lenght of 2nd line : ");
        int b = sc.nextInt();
        System.out.print("Enter lenght of 3rd line : ");
        int c = sc.nextInt();

        if( ((a*a)+(b*b) == (c*c)) || ((b*b)+(c*c) == (a*a)) || ((a*a)+(c*c) == (b*b))){
            System.out.println("This lines will form a RIGHT-ANGLED TRIANGLE.");
        }
        else{
            System.out.println("This lines will NOT form a RIGHT-ANGLED TRIANGLE.");
        }

    }
}
