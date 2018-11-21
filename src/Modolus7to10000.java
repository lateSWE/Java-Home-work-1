public class Modolus7to10000 {
    public static void main(String [] args){
        boolean debug = false;
        boolean run = true;
        double newnum = 0;

        while (run){
            newnum = (newnum + 1);
            if (debug){
                System.out.println(newnum);
            }
            if (newnum % 7 == 0 || newnum % 7 == 7){
                System.out.println(newnum);
            }
            if (newnum >= 10000){
                run = false;
            }
        }
    }
}
