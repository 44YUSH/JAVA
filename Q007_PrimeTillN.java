import java.util.*;
public class Q007_PrimeTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter START no : ");
        int a = sc.nextInt();

        System.out.println("Enter END no :");
        int b = sc.nextInt();
        
        for(int i=a; i<=b; i++){
            int count = 0;

            for(int div=2; div*div <= i; div++){
                if(i % div ==0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println(i);
            }
        }
    }
}
