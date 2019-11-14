package Calculator;

import java.util.Scanner;

public class MathEquations {
    Scanner newInput = new Scanner(System.in);

    public double getMyInput1() {
        return myInput1;
    }

    public void setMyInput1(double myInput1) {
        this.myInput1 = myInput1;
    }

    public double getMyInput2() {
        return myInput2;
    }

    public void setMyInput2(double myInput2) {
        this.myInput2 = myInput2;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getMyResult() {
        return myResult;
    }

    public void setMyResult(double myResult) {
        this.myResult = myResult;
    }

    private double myInput1;
    private double myInput2;

    private char opCode;
    private double myResult;

    public MathEquations () {
        this.opCode = 'a';
    }

    public MathEquations (char opCode) {
        this.opCode = opCode;
    }

    public MathEquations (double myInput1, double myInput2, char opCode) {
        this(opCode);
        this.myInput1 = myInput1;
        this.myInput2 = myInput2;
    }


    public  void  execute () {
        switch (opCode) {
            case 'a':
                myResult = myInput1 + myInput2;
                break;
            case 'm':
                myResult = myInput1 * myInput2;
                break;
            case 'd':
                myResult = myInput2 != 0.0d ? myInput1 / myInput2 : 0.0d;
                break;
            case 's':
                myResult = myInput1 - myInput2;
                break;
            default :
                System.out.println(" No Result");
        }

        System.out.println("The reult from the Math Equations" + myResult);
    }
}
