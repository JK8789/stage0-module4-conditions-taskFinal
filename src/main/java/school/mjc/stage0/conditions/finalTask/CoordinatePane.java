package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public static void printQuadrant(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("zero");
        } else if (x > 0 && y > 0) {
            System.out.println("first");
        } else if (x < 0 && y > 0) {
            System.out.println("second");
        } else if (x < 0 && y < 0) {
            System.out.println("third");
        } else if (x > 0 && y < 0) {
            System.out.println("fourth");
        }
    }

    public static void main(String[] args) {
        printQuadrant(1, 1);
        printQuadrant(-1, 1);
        printQuadrant(-1, -1);
        printQuadrant(1, -1);
        printQuadrant(0, 0);
    }
}
