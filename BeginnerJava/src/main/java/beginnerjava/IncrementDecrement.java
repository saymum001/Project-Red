//Increment Decrement
package beginnerjava;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 25;
        int y;
        y = x++; // post increment 
        System.out.println("Y = " + y);
        y = x;
        System.out.println("Y = " + y);
        y = ++x; // Pre increment 
        System.out.println("Y = " + y);
        y = x--; // Post Decrement 
        System.out.println("Y = " + y);
        y = x;  
        System.out.println("Y = " + y);
        y = --x; // Pre Decrement 
        System.out.println("Y = " + y);
    }
}
