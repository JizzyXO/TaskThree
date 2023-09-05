public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Петров Петр", "Программист", "petrov@mailbox.com", "891212312", 40000, 45);
        employees[2] = new Employee("Сидоров Сидор", "Дизайнер", "sidorov@mailbox.com", "893412312", 35000, 35);
        employees[3] = new Employee("Козлов Константин", "Менеджер", "kozlov@mailbox.com", "890512312", 28000, 50);
        employees[4] = new Employee("Морозова Мария", "Бухгалтер", "morozova@mailbox.com", "896612312", 32000, 42);

        System.out.println("Информация о сотрудниках старше 40 лет:");
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }

        Park park = new Park();
        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "11:00 - 20:00", 600);
        Park.Attraction attraction3 = park.new Attraction("Карусель", "12:00 - 21:00", 300);

        System.out.println("Информация об аттракциях в парке:");
        attraction1.printInfo();
        attraction2.printInfo();
        attraction3.printInfo();
    }
}