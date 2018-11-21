import java.util.Scanner;

public class ProductFromNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        double product = 1;
        double in = 0;
        int version = 0;
        String text1 = "Type a number ";

        while(run) {
            System.out.print(text1);
            in = scanner.nextDouble();
            if (!(in * product >= 10000) && (version < 10) ){
                product = in * product;
                version = version + 1;
            }
            else{
                run = false;
                System.out.println(product);
            }
        }
    }
}
