package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public static void validate(double firstSide, double secondSide, double thirdSide) {
        boolean validTriangle = (firstSide + secondSide > thirdSide)
                && (firstSide + thirdSide > secondSide)
                && (secondSide + thirdSide > firstSide);
        int valToInInt = validTriangle ? 1 : 0;
        String validToStr = switch (valToInInt) {
            case 1 -> {
                yield "this is a valid triangle";
            }
            default -> {
                yield "it's not a triangle";
            }
        };
        System.out.println(validToStr);
    }

    public static void main(String[] args) {
        validate(1, 2, 3);
        validate(1, 4, 4);
    }
}
