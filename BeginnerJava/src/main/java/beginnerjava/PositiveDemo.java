//If statement
package beginnerjava;
import java.util.Scanner;
public class PositiveDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any Integer: ");
        num = input.nextInt();
        if(num>0){
            System.out.println("The number is positive.");
        }
        else if(num<0)
        {
            System.out.println("The number is Negative");
        }
        else
        {
             System.out.println("The number is Zero");       
        }
    }
}
