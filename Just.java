/**
 * Just
 */
import java.util.Scanner;
public class Just {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треуголное число: %d\n", giveMeNumder(i));
        iScanner.close();
    }

    public static int giveMeNumder(int a) {
        return (a * (a + 1)) / 2;
    }
    
}



