import java.util.Scanner;

public class xStepsv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "x";
        String space = " ";
        boolean run1 = true;
        boolean run2 = true;
        boolean run3 = true;
        boolean run4 =true;
        int maxwidth = 0;
        int version1 = 0;
        int version2 = 0;
        int version3 = 0;
        int version4 = maxwidth/2;

        System.out.print("Type max width: ");
        maxwidth = scanner.nextInt();
        while (run1) {
            System.out.println();
            version2 = 0;
            version3 = 0;
            run2 = true;
            run3 = true;
            run4 = true;


            version1 = version1 + 1;
            version3 = version1 / 2 -1;
            while (run4){
                System.out.print(space);

                if (){
                    run4 = false;
                }
            }
            while (run2) {
                version2 = version2 + 1;
                System.out.print(text);
                System.out.print(space);

                if (version2 == version1) {
                    run2 = false;
                }
            }
            if (version2 == maxwidth) {
                System.out.println();
                run1 = false;
                System.out.println("Done!");
            }
            version4 = version4 - 1;
        }
    }
}