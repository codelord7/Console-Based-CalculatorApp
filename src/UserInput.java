import java.util.Scanner;
import java.lang.*;
public class UserInput {

        private static Scanner scanner = new Scanner(System.in);


    public double getMenuInputFromUser() {

            double menuoptions = scanner.nextDouble();

            return menuoptions;


       // System.out.println("==>" + firstoperand + "+" + secondoperand + "=" + (firstoperand + secondoperand));
    }
}
