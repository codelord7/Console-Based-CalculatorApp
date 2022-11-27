import java.util.HashMap;

public class CalculatorEngine extends AbstractCalculator {

    private double choice;
    private double operand1;
    private double operand2;
    private HashMap<Integer, CalcOperation> operationMap = new HashMap<>();
    CalcOperation operationmapvalue;

    CalculatorEngine() {
        operationMap.put(1, new Addition());
        operationMap.put(2, new Subtraction());
        operationMap.put(3, new Multiplication());
        operationMap.put(4, new Division());
        operationMap.put(5, new Logarithm());
        operationMap.put(6, new Exponential());


    }


String[] SelectCalcOperation(double choice, double operand1, double operand2) {

        if (operationMap.containsKey((int)choice)) {
            this.operationmapvalue = operationMap.get((int)choice);
        }
       return operationmapvalue.CalculateResult(operand1,operand2);
    }
}