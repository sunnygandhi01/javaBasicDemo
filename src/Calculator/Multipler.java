package Calculator;

public class Multipler extends CalculateBase {
    public Multipler() {};

    public Multipler(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    @Override
    public void calculate() {
        double result = getLeftVal() * getRightVal();
        setResult(result);
    }
}
