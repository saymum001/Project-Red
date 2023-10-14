
package beginnerjava;
import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double cels, farn;
        boolean d = true;
    
    System.out.print("Fahrenheit = ");
    farn = input.nextDouble();
    cels = 0.5555556 * (farn - 32);
    System.out.printf("Celcius = %.3f\n", cels);
    }
}
