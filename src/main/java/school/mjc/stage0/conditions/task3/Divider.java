package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if (number % 5 == 0 && number % 11 == 0)
            System.out.println("Dividable");
        else if (number == 0)
            System.out.println("not divide by zero");
        else
            System.out.println("Non-dividable");
    }
}
