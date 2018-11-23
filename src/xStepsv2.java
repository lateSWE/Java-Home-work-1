import java.util.Scanner;

public class xStepsv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = " ";
        String text2 = "X ";
        System.out.print("Max width: ");

        int maxwidth = scanner.nextInt();

        for (int i = 0; i < maxwidth; i++) {
            for (int j = maxwidth - i; j > 1; j--) {
                System.out.print(text1);
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(text2);
            }

            System.out.println();
        }
    }
}
