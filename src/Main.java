public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.newEmployee(new Employee("Карасик В.В.", 1, 26500));
        employeeBook.newEmployee(new Employee("Черняев В.А.", 2, 29000));
        employeeBook.newEmployee(new Employee("Шмелев А.Д.", 3, 25000));
        employeeBook.newEmployee(new Employee("Назаров А.П.", 4, 28959));
        employeeBook.newEmployee(new Employee("Котова С.Г.", 2, 37000));
        employeeBook.newEmployee(new Employee("Сомова М.М.", 1, 28245));
        employeeBook.newEmployee(new Employee("Уткин М.А.", 2, 20));
        employeeBook.newEmployee(new Employee("Широкова А.Д.", 3, 31500));
        employeeBook.newEmployee(new Employee("Воронцов Я.К.", 4, 70055));

        employeeBook.printAllDataEmployees();
        System.out.println("Cумма затрат на зарплаты за месяц: " + employeeBook.sumSalary() + " рублей.");
        System.out.println("Минимальная сумма затрат за месяц: " + employeeBook.minSalary() + " рублей.");
        System.out.println("Максимальная сумма затрат за месяц: " + employeeBook.maxSalary() + " рублей.");
        System.out.println("Средняя зарплата в месяц: " + employeeBook.averageSalaryEmployees() + " рублей.");
        System.out.println(employeeBook.printAllNameOfEmployees());
        System.out.println("Индексация зарплаты: ");
        employeeBook.salaryIndexingByRate(7);
        employeeBook.printAllDataEmployees();
        System.out.println("Минимальная зарплата в отделе: ");
        System.out.println(employeeBook.minSalaryInDepartment(2));
        System.out.println("Максимальная зарплата в отделе: ");
        System.out.println(employeeBook.maxSalaryInDepartment(2));
        System.out.println("Сумма затрат на зарплаты в отделе: ");
        System.out.println(employeeBook.sumSalaryInDepartment(2));
        System.out.println("Средняя зарплата в отделе:");
        System.out.println(employeeBook.averageSalaryInDepartment(2));
        employeeBook.salaryIndexingByRateInDepartment(2, 13);
        employeeBook.printAllDataInDepartment(2);
        System.out.println("Список зарплат меньше уровня: ");
        employeeBook.filterByLessSalaryLevel(27000);
        System.out.println("Список зарплат больше уровня:");
        employeeBook.filterByAboveSalaryLevel(27500);
        System.out.println("Добавление сотрудника: ");
        employeeBook.newEmployee(new Employee("Добавленный Н.Н.", 1, 50000));
        employeeBook.printAllDataEmployees();
        System.out.println("Удаление сотрудника: ");
        employeeBook.deleteEmployee(2);
        employeeBook.printAllDataEmployees();
        System.out.println("Перевод сотрудника в другой отдел с изменением зарплаты: ");
        employeeBook.editEmployee("Карасик В.В.", 7000, 3);
        employeeBook.printAllDataEmployees();
        employeeBook.printEmployeesDepartment();

    }

}









