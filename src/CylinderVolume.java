import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius? ");
        double InputRadius = scanner.nextDouble();
        System.out.print("Hight? ");
        double InputHight = scanner.nextDouble();
        System.out.print("Answer");
        System.out.println(Math.pow(InputRadius, 2.0D) * 3.141592653589793D * InputHight);
    }
}
