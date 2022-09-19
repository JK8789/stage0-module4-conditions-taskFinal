package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public static void printCompletelyDivided(int dividend, int divider) {
        String output;
        if (divider != 0) {
            int division = dividend / divider;
            boolean completeDivision = divider * division == dividend;
            int completeDivisionToInt = completeDivision ? 1 : 0;
            output = switch (completeDivisionToInt) {
                case 1:
                    yield "can be divided completely";
                case 0:
                    yield "cannot be divided completely";
                default:
                    yield "invalid";
            };
        } else {
            output = "division by zero";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        printCompletelyDivided(7, 2);
        printCompletelyDivided(6, 2);
        printCompletelyDivided(6, 0);
        printCompletelyDivided(4, 2);

    }
}
