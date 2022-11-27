public class AppInterface {

    public static void printLogo() {
        int i;
        for (i = 0; i <= 70; i++) {
            System.out.print("=");
        }

    }

    public void printUserMenu(){

        System.out.println();
        System.out.println("choose Function:");
        System.out.println("[1] Add");
        System.out.println("[2] Subtract");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.println("[5] logarithm");
        System.out.println("[6] Exponential Calculation");

        System.out.println();
        System.out.println("[7] Exit");


    }
}
