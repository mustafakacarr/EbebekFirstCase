public class Base {

    public static void main(String[] args) {
        Employee employee = new Employee("Mustafa", 1200, 41, 2002);
        System.out.println("Adı \t\t Maaşı \t\t Çalışma Saati \t\t Başlangıç Yılı \t\t Vergi \t\t" +
                " Bonus \t\t Maaş Artışı \t\t Vergi ve Bonuslarla Birlikte Maaş \t\t Toplam Maaş ");
        System.out.println(employee.toString());
    }
}
