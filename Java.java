import java.io.IOException;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
     double a,b,c,d;
     Scanner input = new Scanner(System.in);
     a = input.nextDouble();
     b = input.nextDouble();
     d = input.nextDouble();
     c = (a * 2 + b * 3 + d * 5) / 10;
     System.out.printf("MEDIA = %.1f\n", c);
    }
}
