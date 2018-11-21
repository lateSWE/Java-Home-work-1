import java.util.Scanner;

public class SumFromNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        /**
         * Declares the variable to make the code clean and makes it easy to change the text
         */
        double sum = 0;
        double in = 0;
        boolean run = true;
        String text1 = "Type a number";
        String text2 = "The sum is: ";

        /**
         * The acual program that ask's the user what number it should use and prints an output
          */
        System.out.println(text1);
        while(run) {
            in = scanner.nextDouble();
            sum = sum + in;
            if (in == 0){
                run = false;
                System.out.println(text2 + sum);
            }
            else {
                System.out.println(text1);
            }
        }

    }
}
