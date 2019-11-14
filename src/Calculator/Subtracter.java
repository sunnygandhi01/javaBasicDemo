package Calculator;

public class Subtracter extends CalculateBase {
    public Subtracter() {};

    public Subtracter(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    @Override
    public void calculate() {
        double result = getLeftVal() - getRightVal();
        setResult(result);
    }
}
