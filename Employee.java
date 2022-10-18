
public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
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

    public double bonus() {
        double bonus;
        if (getWorkHours() > 40) {
            bonus = (getWorkHours() - 40) * 30;
        } else {
            bonus = 0;
        }
        return bonus;
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
        return raise;
    }

    @Override
    public String toString() {
        String mesaj = "Adı : " + getName() + "\n"
                + "Maaşı : " + getSalary() + "\n"
                + "Çalışma Saati : " + getWorkHours() + "\n"
                + "Başlangıç Yılı : " + getHireYear() + "\n"
                + "Vergi : " + tax() + "\n"
                + "Bonus : " + bonus() + "\n"
                + "Maaş Artışı : " + raiseSalary() + "\n"
                + "Vergi ve Bonuslar ile Birlikte Maaş : " + (getSalary()-tax()+bonus()) + "\n"
                + "Toplam Maaş : " + (raiseSalary()+getSalary()+bonus()-tax()) + "\n";
        return mesaj;
    }
}
