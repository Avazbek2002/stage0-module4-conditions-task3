package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000 && salary > 0)
            System.out.println((float)salary * 0.85);
        else if (salary > 10000 && salary <=20000)
            System.out.println((float)salary * 0.82);
        else if (salary > 20000)
            System.out.println((float)salary * 0.8);
        else
            System.out.println("wrong input!");
    }
}
