import java.util.Scanner;
import static java.lang.Math.*;

public class Deltaa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwszą cyfrę A: ");
        int a = scan.nextInt();
        System.out.println("Podaj drugą cyfrę B: ");
        int b = scan.nextInt();
        System.out.println("Podaj trzecią cyfre C: ");
        int c = scan.nextInt();

        int d = b * b - 4 * a * c;

        System.out.println("Delta wynosi D: " + d);

        if (d < 0) {
            System.out.println("Delta jest mniejsza od 0");
        }
        else
        if (d == 0){
            int xo = -b / 2 * a;
            System.out.println("Delta jest równa zeru");
        }
        else
        if (d > 0){
            double x1 = (-b-sqrt(d))/2*a;
            double x2 = (-b+sqrt(d))/2*a;
            System.out.println("Delta jest większa od zera dlatego mamy 2 rozwiązania");
        }
    }
}
