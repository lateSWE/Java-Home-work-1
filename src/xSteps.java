import java.util.Scanner;

public class xSteps {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        boolean run1 = true;
        boolean run2 = true;
        int maxwidth = 0;
        int version1 = 0;
        int version2 = 0;
        String text = "Type desired max width (base)";

        System.out.println(text);
         maxwidth = scanner.nextInt();
        while (run1){
            run2 = true;
            version2 = version2 + 1;
            while (run2){

                if (version2 == version1) {
                    run2 = false;
                }
            }
            if (version1 == maxwidth){
                run1 = false;
            }
            version1 = version1 + 1;
        }
    }
}
