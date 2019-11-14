package Calculator;

import java.util.Arrays;

public class Main<calculators> {

    public static void main(String[] args) {
        MathEquations[] equation = new MathEquations[4];
        equation[0] = new MathEquations(10.0d, 10.0d, 'a');
        equation[1] = new MathEquations(10.0d, 10.0d, 'd');
        equation[2] = new MathEquations(10.0d, 10.0d, 'm');
        equation[3] = new MathEquations(10.0d, 10.0d, 's');

        System.out.println("The length of the equation Array:  " + equation.length);
        System.out.println("Trying to print the Array" + Arrays.toString(equation));

        for (MathEquations equations : equation) {
            equations.execute();
            System.out.println("The result of execute:  " + equations.getMyResult());
        }

        /**
         * This is checking Method Overloading
         */
        System.out.println("This is now constructor and Methods overloading.");
        CalculateBase[] cb = {
                new Adder(100.0d, 50.0d),
                new Subtracter(40.0, 20.0),
                new Divider(10.0d, 5.0d),
                new Multipler(5.0d, 5.0d)
        };

        for (CalculateBase cb1:cb) {
            cb1.calculate();
            System.out.println(cb1.toString());
            System.out.println(cb1.getResult());
        }

        /**
         * This is checking Object Class Inheritance
         */
        System.out.println("This is now Class Inheritance.");
        Object[] cb2 = new CalculateBase[4];

        CalculateBase[] cb3 = (CalculateBase[]) cb2;

        cb3[0] = new Adder(100.0d, 50.0d);
        cb3[1] = new Subtracter(40.0, 20.0d);
        cb3[2] = new Divider(10.0d, 5.0d);
        cb3[3] = new Multipler(5.0d, 5.0d);

        for (CalculateBase cb1:cb3) {
            cb1.calculate();
            System.out.println(cb1.toString());
            System.out.println(cb1.getResult());
        }


        /**
         * This is for String Builder and String Buffer.
         */
        System.out.println("This is for String Classes and some Enum.");
        String [] Statements = {
                "divide 10.0 5.0",
                "add 100.0 50.0",
                "subtract 40.0 20.0",
                "multiple 5.0 5.0"
        };

        CalculatorHelper helper = new CalculatorHelper();
        for (String statement: Statements) {
            helper.process(statement);
            System.out.println(helper);
        }

    }



    public static MathEquations createValues(double myInput1, double myInput2, char opCodes) {
        MathEquations equations = new MathEquations();
        equations.setMyInput1(myInput1);
        equations.setMyInput2(myInput2);
        equations.setOpCode(opCodes);

        return equations;

    }
}