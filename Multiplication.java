
package multiplication;
import java.util.Scanner;


public class Multiplication {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        
        System.out.println("Bang cuu chuong cua " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        
    }
    
}
