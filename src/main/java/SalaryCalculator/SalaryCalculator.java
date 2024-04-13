package main.java.SalaryCalculator;

public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped < 5) ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold > 19) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = salaryMultiplier(daysSkipped) * 1000 + bonusForProductsSold(productsSold);
        return (salary < 2000) ? salary : 2000;
    }
}
