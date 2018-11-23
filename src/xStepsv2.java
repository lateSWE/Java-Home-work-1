import java.util.Scanner;

public class xStepsv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = "x ";
        String text2 = "  ";
        boolean run1 = true;
        int maxwidth = 0;
        int width = 0;

        System.out.println("Width of base: ");
        maxwidth = scanner.nextInt();
        while (run1){


            if (width == maxwidth){
                run1 = true;
            }
        width = width + 1;
        }
    }
}