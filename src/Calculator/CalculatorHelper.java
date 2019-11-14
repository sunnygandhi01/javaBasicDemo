package Calculator;

public class CalculatorHelper {
    CalcCommand command;
    double leftVal, rightVal, result;

    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char DIVIDE_SYMBOL = '/';
    private static final char MULTIPLY_SYMBOL = '*';

    public void process(String statement) {
        String[] parts = statement.split(" ");

        String commandString = parts[0];
        leftVal = Double.parseDouble(parts[1]);
        rightVal = Double.parseDouble(parts[2]);

        setCommandFromString(commandString);

        CalculateBase calculator = null;
        switch (command) {
            case Add:
                calculator = new Adder(leftVal, rightVal);
                break;
            case Subtract:
                calculator = new Subtracter(leftVal, rightVal);
                break;
            case Divide:
                calculator = new Divider(leftVal, rightVal);
                break;
            case Multiple:
                calculator = new Multipler(leftVal, rightVal);
                break;
        }

    }

    public void setCommandFromString (String commandString) {
        if(commandString.equalsIgnoreCase(CalcCommand.Add.toString())) {
            command = CalcCommand.Add;
        }

        if(commandString.equalsIgnoreCase(CalcCommand.Divide.toString())) {
            command = CalcCommand.Divide;
        }

        if(commandString.equalsIgnoreCase(CalcCommand.Multiple.toString())) {
            command = CalcCommand.Multiple;
        }

        if(commandString.equalsIgnoreCase(CalcCommand.Subtract.toString())) {
            command = CalcCommand.Subtract;
        }
    }

    @Override
    public String toString() {
        char symbol = ' ';

        switch (command) {
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
            case Multiple:
                symbol = MULTIPLY_SYMBOL;
                break;
        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightVal);
        sb.append("=");
        sb.append(result);

        return sb.toString();

    }
}
