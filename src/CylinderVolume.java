import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double InputRadius = 0;
        double InputHeight = 0;

        /**
         * Ask's what radius the program should use
         */
        System.out.print("What radius? ");
        InputRadius = scanner.nextDouble();

        /**
         * Ask's what the height the program should use
         */
        System.out.print("What height? ");
        InputHeight = scanner.nextDouble();

        /**
         * Calculates the volume/answer
         */
        System.out.print("Answer: ");
        System.out.println(Math.pow(InputRadius, 2.0D) * 3.141592653589793D * InputHeight);
    }
}
