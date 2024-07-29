import java.util.Scanner;

/**
 * positive
 */
public class positive {

    public static void PositiveNegativeZero(int n){

        if ( n > 0 ){
            System.out.println(n +" is a Positive number.");
        } else if ( n < 0) {
            System.out.println(n +" is a Negative number.");
        } else {
            System.out.println(n +" is a zero number.");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value = ");int n = sc.nextInt();

        PositiveNegativeZero(n);
    }
}