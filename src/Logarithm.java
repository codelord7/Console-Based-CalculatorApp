public class Logarithm implements CalcOperation{
    public  String[] CalculateResult(double operand1, double operand2){
        double result = (Math.log(operand1))/(Math.log(operand2));
        String[] s = {"/", String.valueOf(result)};
        return s ;
    }
}
