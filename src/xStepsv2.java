import java.util.Scanner;

public class xStepsv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = "x ";
        String text2 = "  ";
        boolean run1 = true;
        boolean run2 = true;
        int maxwidth = 0;       //base
        int width = 0;          //i
        int size = 0;           //j

        System.out.println("Width of base: ");
        maxwidth = scanner.nextInt();
        while (run1){
            width = width + 1;
            size = 0;
            run2 = true;


            while (run2) {
                size = maxwidth - width;


                if (){
                    run2 = false;
                }
            }


            if (width == maxwidth){
                run1 = true;
            }
        }
    }
}