package demo1.somkiat.somkiatcalculator;


public class MainController {

    Calculator calculator = new Calculator();
    CalculatorListener listener;

    public void setListener(CalculatorListener listener) {
        this.listener = listener;
    }

    public void add(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.addplus(firstOperand, secondOperand)));
    }

    public void sub(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.sub(firstOperand, secondOperand)));
    }


}
