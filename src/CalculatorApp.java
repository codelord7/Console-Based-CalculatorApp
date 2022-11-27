
import java.lang.Exception;
import java.util.Scanner;

public class CalculatorApp {


    public static void main(String[] args) throws Exception {
        boolean runloop = false;

        UserInput input = new UserInput();
        AppInterface logo = new AppInterface();
        logo.printLogo();
        System.out.println();
        System.out.println("A Simple Java Console-based Calculator");
        logo.printLogo();
        System.out.println();
        while (!runloop) {
            logo.printUserMenu();
            System.out.print("input:\t" );
             double inputoptions = input.getMenuInputFromUser();
            if(inputoptions != (int)inputoptions || inputoptions > 7 || inputoptions < 1) throw new Exception("Input is not acceptable");
            if (inputoptions == (int) 7) {

                runloop = true;
                break;

            }
            if(inputoptions == 5 ) {
                System.out.print("value:");
                double value = input.getMenuInputFromUser();
                System.out.print("basis:" + "");
                double basis= input.getMenuInputFromUser();
                AbstractCalculator calculatorlog = new CalculatorEngine();
                String[] logresult = calculatorlog.SelectCalcOperation(inputoptions, value, basis);
                System.out.print("==>" + " " + "log_"  + " " + value +"(" + basis + ")"  + " " + "=" + " " + logresult[1]);

                System.out.println();
                logo.printLogo();

                continue;
            }

            if(inputoptions == 6 ) {
                System.out.print("Basis:\t");
                double exponentbasis = input.getMenuInputFromUser();
                System.out.print("Exoponent:\t");
                double exponentvalue = input.getMenuInputFromUser();
                AbstractCalculator calculatorlog = new CalculatorEngine();
                String[] exponentresult = calculatorlog.SelectCalcOperation(inputoptions, exponentbasis,exponentvalue);
                System.out.print("==>" +" "+  exponentbasis + " " +  exponentresult[0] + exponentvalue  + " " +  "=" + " " + exponentresult[1]);
                System.out.println();
                logo.printLogo();
                continue;
            }

                System.out.print("operand-1:" + "");
                double operand1 = input.getMenuInputFromUser();
                System.out.print("operand-2:" + "");
                double operand2 = input.getMenuInputFromUser();
                AbstractCalculator calculator = new CalculatorEngine();
                String[] result = calculator.SelectCalcOperation(inputoptions, operand1, operand2);
                System.out.print("==>" + " " + operand1 + " " + result[0] + " " + operand2 + " " + "=" + " " + result[1]);

                System.out.println();
            logo.printLogo();





        }
    }
}