public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double tax() {
        double taxPrice;
        if (getSalary() > 1000) {
            taxPrice = getSalary() * 3 / 100;
        } else {
            taxPrice = 0;
        }
        return taxPrice;
    }

    public int bonus() {
        int bonus;
        if (getWorkHours() > 40) {
            bonus = (getWorkHours() - 40) * 30;
        } else {
            bonus = 0;
        }
        return bonus*4;
        //Aylık fark.
    }

    public double raiseSalary() {
        int thisYear = 2021;
        double raise = 0;
        int workingYears = thisYear - getHireYear();
        if (workingYears < 10) {
            raise = getSalary() * 5 / 100;
        } else if (workingYears > 9 && workingYears < 20) {
            raise = getSalary() * 10 / 100;
        } else if (workingYears > 19) {
            raise = getSalary() * 15 / 100;
        }
        return raise+bonus()+getSalary()-tax();
    }

    @Override
    public String toString() {
        return getName() + " \t " + getSalary() + " TL  \t\t "+getWorkHours()+" Saat  \t\t\t "+getHireYear()+" \t\t\t\t"+tax()+" TL \t" +
                " "+bonus()+" TL  \t\t "+(raiseSalary()-(double)getSalary())+" TL  \t\t\t\t\t "+raiseSalary()+" TL  \t\t\t\t "+raiseSalary()+" TL ";
    }
}
