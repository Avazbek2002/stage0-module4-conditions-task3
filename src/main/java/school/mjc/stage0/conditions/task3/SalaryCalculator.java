package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000 && salary > 0)
            System.out.println((float)salary * 0.15);
        else if (salary > 10000 && salary <=20000)
            System.out.println((float)salary * 0.18);
        else if (salary > 20000)
            System.out.println((float)salary * 0.2);
        else
            System.out.println("wrong input!");
    }
}
