public class Division implements CalcOperation {

    public  String[] CalculateResult(double operand1, double operand2){
        double result = operand1 / operand2;
        String[] s = {"/", String.valueOf(result)};
        return s ;
    }
}
