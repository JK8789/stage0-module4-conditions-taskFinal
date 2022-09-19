package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void printDays(int year, int month) {
        boolean leapYear = ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0)));
        boolean validDate = (year > 0) && (month > 0) && (month < 13);
        if (!validDate) {
            System.out.println("invalid date");
        } else if (leapYear && month == 2) {
            System.out.println("29");
        } else {
            int date = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    yield 31;
                }
                case 2 -> {
                    yield 28;
                }
                case 4, 6, 9, 11 -> {
                    yield 30;
                }
                default -> {
                    yield -1;
                }
            };
            System.out.println(date);
        }
    }

    public static void main(String[] args) {
        printDays(-1, 2);
        printDays(2024, 2);
        printDays(2022, 2);
        printDays(-1, 2);
        printDays(2022, -2);
    }
}
