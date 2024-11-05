
package numberpyramid;
import java.util.Scanner;


public class NumberPyramid {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {        
            for (int j = 1; j <= i; j++) {      
                System.out.print(j + " ");
            }
            System.out.println();             
        }
        
    }
    
}
