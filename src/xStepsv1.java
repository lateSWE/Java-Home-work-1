import java.util.Scanner;

public class xStepsv1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String text = "x";
        boolean run1 = true;
        boolean run2 = true;
        int maxwidth = 0;
        int version1 = 0;
        int version2 = 0;

        System.out.print("Type max width: ");
        maxwidth = scanner.nextInt();
        while (run1){
            System.out.println("");
            version2 = 0;
            version1 = version1 + 1;
            run2 = true;
            while (run2){
                version2 = version2 + 1;
                System.out.print(text);
                if (version2 == version1){
                    run2 = false;
                }
            }
            if (version2 == maxwidth){
                System.out.println();
                run1 = false;
                System.out.println("Done!");
            }
            version2 = version2 + 1;
        }
    }
}
