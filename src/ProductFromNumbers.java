import java.util.Scanner;

public class ProductFromNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        double product = 1;
        int version = 0;
        String text1 = "Type a number";

        while(run) {
            System.out.print(text1);
            if ((product * product >= 10000) || ){
                product = product * product;
            }
            else {
                System.out.println("Error something went wrong!");
            }
            if (product >= 10000 || version >= 10){
                run = false;
                System.out.println(product);
            }
        }
    }
}
