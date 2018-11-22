import java.util.Scanner;

public class xSteps {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String text = "x";
        boolean run1 = true;
        boolean run2 = true;
        int maxwidth = 0;
        int version1 = 0;
        int version2 = 0;

        maxwidth = scanner.nextInt();
        while (run1){
            version1 = version1 + 1;
            run2 = true;
            while (run2){
                version2 = version2 +1;
                System.out.print(text);
                if (version2 == version1){
                    run2 = false;
                }
            }
            if (version2 == maxwidth){
                run1 = false;
                System.out.println("Done!");
            }
            version2 = version1;
        }
    }
}
