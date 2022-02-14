package ru.geekbrains.lesson5;

public class HomeWork5App {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Cash Carrabot","Administrative Assistant II","ccarrabot@biglobe.ne.jp","8715674315",80000,26),
                new Employee("Nahum Fairhall","Quality Control Specialist","nfairhall1@accuweather.com","8715674310",110000,32),
                new Employee("Beverlie Scantleberry","Financial Advisor","bscantleberry@nature.com","8715671501",140000,44),
                new Employee("Cello Gelluley","Spech Patologist","cgilulley@army.nil","8567114315",90000,52),
                new Employee("Job Owen","Structural Analysis Engineer","joven4@archive.org","8715114315",150000,31)
        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }
    }
}
