public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int minBonusHours = 40;
    int bonusHourlyFee = 30;
    int currentYear = 2022;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    double bonus() {
        if (this.workHours <= minBonusHours) {
            return 0;
        } else {
            return (this.workHours - minBonusHours) * bonusHourlyFee;
        }
    }

    double raiseSalary() {
        if ((currentYear - this.hireYear <= 10) && (currentYear - this.hireYear > 3)) {
            return this.salary * 0.05;
        } else if (currentYear - this.hireYear <= 20) {
            return this.salary * 0.1;
        } else if (currentYear - this.hireYear > 20) {
            return this.salary * 0.15;
        } else {
            return 0;
        }
    }

    public void toStrings() {
        System.out.println("Name : " + this.name);
        System.out.println("Working Hour : " + this.workHours);
        System.out.println("Start Year : " + this.hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Salary Increase : " + raiseSalary());
        System.out.println("Salary with tax and bonus : " + (this.salary + bonus() - tax()));
        System.out.println("Total Salary : " + (this.salary + bonus() - tax() + raiseSalary()));
    }
}
