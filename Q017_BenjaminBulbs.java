import java.util.*;
public class Q017_BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("Bulbs that will glow after all toggles are : ");
        for (int i = 1; i*i <= n; i++) {
            // Just print the perfect square.
            System.out.print(i * i + " ");
        }
    }
}
