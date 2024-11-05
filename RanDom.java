
package random;
import java.util.Scanner;
import java.util.Random;

public class RanDom {
    

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int Number = random.nextInt(50-1) + 1;
        int User = 0; 
        
        System.out.println("===>Tro choi đoan so<===");
        System.out.println("Doan mot so tu 1 den 50: ");

        while (User != Number) {
            System.out.print("EnTer Number: ");
            User = scanner.nextInt();

            if (User < Number) {
                System.out.println("So cua ban thap hon.");
            } else if (User > Number) {
                System.out.println("So cua ban cao hon.");
            } else {
                System.out.println("Ban doan dung so la " + Number);
            }
        }
    }
    
}
