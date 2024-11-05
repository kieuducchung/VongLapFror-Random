
package fibonacci;
import java.util.Scanner;

public class Fibonacci {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n Fibonacci can in: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1;
        
        System.out.print("Day Fibonacci: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            
            int next = first + second; 
            first = second;            
            second = next;
        }
    }
}
