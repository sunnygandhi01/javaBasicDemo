package Calculator;

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    public CalculateBase() {
    }

    public CalculateBase(double leftVal, double rightVal) {
        this.setLeftVal(leftVal);
        this.setRightVal(rightVal);
    }

    public CalculateBase(CalculateBase cb) {
        this.leftVal = cb.getLeftVal();
        this.rightVal = cb.getRightVal();
    }


    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public abstract void calculate();

    @Override
    public String toString() {
       return "The leftVal is: " + this.leftVal+ " And the rightVal is: " + this.rightVal + " and the result is: " + this.getResult();
    }
}
